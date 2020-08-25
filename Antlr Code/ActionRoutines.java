import java.util.*;

public class ActionRoutines{
	static HashMap<String, ArrayList<Object>> lists = new HashMap<String, ArrayList<Object>>();
	
	ArrayList<Integer> condList = new ArrayList<Integer>();		//-1 not evaluated, 000 FFF, 001 FFT (32 bits); 
	//Will work as a stack which fits up to 32 expressions; If we need more, we can just replace Integer by an actual stack 
	
	String condVar, listToCheck;								
	
	void createList(String listID){
		lists.put(listID, new ArrayList<Object>());
	}
	
	void addValue(String listID, Object val){
		lists.get(listID).add(val);
	}
	
	void updateValue(String listID, int index, Object val){
		lists.get(listID).set(index, val);
	}
	
	void concList(String listID0, String listID1){
		ArrayList<Object> dest = lists.get(listID0);
		ArrayList<Object> temp = lists.get(listID1);
		
		for(int i = 0; i < temp.size(); i++){
			dest.add(temp.get(i));
		}
	}
	
	//idx0 inclusive, idx1 exclusive
	void sliceList(String listID0, String listID1, String s0, String s1){
		ArrayList<Object> dest = lists.get(listID0);
		ArrayList<Object> source = lists.get(listID1);
		
		int idx0 = 0, idx1 = 0;
		if (s0 == null){ idx0 = 0; }
		else{ idx0 = Integer.parseInt(s0); }
		if (s1 == null){ idx1 = source.size(); }
		else{ idx1 = Integer.parseInt(s1); }		
		
		if (idx0 >= idx1){ return; }
		
		for(int i = idx0; i < idx1; i++){
			dest.add(source.get(i));
		}
	}
	
	void setUpConditions(String listID0, String listID1, String varName){
		condList.clear();
		int s = lists.get(listID1).size();
		for(int i = 0; i < s; i++){
			condList.add(-1);
		}
		condVar = varName;
		listToCheck = listID1;
	}
	
	void applyConditions(String listID0, String listID1){
		ArrayList<Object> dest = lists.get(listID0);
		ArrayList<Object> source = lists.get(listID1);

		for(int i = 0; i < source.size(); i++){
			if (condList.get(i) == 1){
				dest.add(source.get(i));
			}
		}
	}
	
	void evaluate(String lhs, String op, String rhs){
		ArrayList<Object> source = lists.get(listToCheck);
				
		int boundL = (int)'0', boundR = (int)'9';
		for(int i = 0; i < source.size(); i++){
			int curLeft = 0, curRight = 0;
			
			if (boundL <= (int)lhs.charAt(0) && (int)lhs.charAt(0) <= boundR){
				curLeft = Integer.parseInt(lhs);
			}
			else if (!lhs.equals(condVar)){
				System.out.println("Unknown variable " + lhs + ". Did you mean " + condVar);
				continue;
			}
			else{
				curLeft = Integer.parseInt(source.get(i).toString());
			}			
			if (boundL <= (int)rhs.charAt(0) && (int)rhs.charAt(0) <= boundR){
				curRight = Integer.parseInt(rhs);
			}
			else if (!rhs.equals(condVar)){
				System.out.println("Unknown variable " + rhs + ". Did you mean " + condVar);
				continue;
			}
			else{
				curRight = Integer.parseInt(source.get(i).toString());
			}
			
			boolean curB = true;
			if (op.equals("==")){
				curB = (curLeft == curRight);
			}
			else if (op.equals("!=")){
				curB = (curLeft != curRight);
			}
			else if (op.equals("<")){
				curB = (curLeft < curRight);
			}
			else if (op.equals("<=")){
				curB = (curLeft <= curRight);
			}
			else if (op.equals(">")){
				curB = (curLeft > curRight);
			}
			else if (op.equals(">=")){
				curB = (curLeft >= curRight);
			}
			
			if (condList.get(i) == -1){
				condList.set(i, (curB?1:0));
			}
			else{
				int prev = condList.get(i);
				prev*=2;
				prev += (curB?1:0);			//Set a new bit (shifting the others left)
				condList.set(i, prev);			
			}
		}
	}
	
	void combine(String o){		
		ArrayList<Object> source = lists.get(listToCheck);

		//Each time, we combine the last two bits into 1 (pushing other bits to the right if they exist)
		for(int i = 0; i < source.size(); i++){
			int ones = 0, prev = condList.get(i);
			if ((prev&1)==1) { ones++; }  prev/=2;
			if ((prev&1)==1) { ones++; prev--; }
			
			if (o.equals("and")){	
				if (ones == 2){prev++;}
			}
			else if (o.equals("or")){
				if (ones!=0){prev++;}
			}
			condList.set(i, prev);
		}
	}
	
	void flip(){
		ArrayList<Object> source = lists.get(listToCheck);
	
		for(int i = 0; i < source.size(); i++){
			int prev = condList.get(i);
			
			//Flip the rightmost (and most recently encoded) bit
			if (prev%2 == 0){prev++;}
			else{ prev--; }
			
			condList.set(i, prev);		
		}
	}
	
	void printList(String listID){
		System.out.println(listID + " is " + lists.get(listID));
	}
}