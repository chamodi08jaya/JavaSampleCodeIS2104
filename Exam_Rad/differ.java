public class differ{
	public static void main(String[] args){
		int lowerbound=1;
		int upperbound=100;
		int sumeven=0,sumodd=0;
		for(int i=lowerbound;i<=upperbound;i++){
			if(i%2==0){
				sumeven=sumeven+i;
			}else{
				sumodd=sumodd+i;
			}
		}
		System.out.println("sum of even"+sumeven);
		System.out.println("sum of odd"+sumodd);
		int absolute;
		if(sumeven>sumodd){
			absolute=sumeven-sumodd;	
		}else{
			absolute=sumodd-sumeven;
		}
		System.out.println("absolute difference "+absolute);
	}
}