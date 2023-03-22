public class Hello{
	public static void main(String[] args){
		for(int i=2;i<=100;i++){
			int counter = 0;
			for(int j=i-1; j>1; j--){
				if(j<2) continue;
				if(i%j==0) counter++;
			}
			if(counter==0) System.out.println(i);
		}
	}
}