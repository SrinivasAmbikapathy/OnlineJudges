public class Main {
	public static void main(String[] args) throws Exception {
		 java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
	     int total = Integer.parseInt(r.readLine());
	     long mod = 1000007;
	     for(int i=0;i<total;i++){
	    	 long no = Long.parseLong(r.readLine())%mod;
	    	 long result = ((3*no*no)+no)%mod;
	    	 result /=2;
	    	 System.out.println(result);
	     }
	}
}