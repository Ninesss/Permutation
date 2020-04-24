public class Permutation {
	public static int solution(int[] A, int N){
        int[] a = new int[N];
        for(int i = 0; i < N; ++i){
            if(A[i]-1 >= N) return 0;
            a[A[i]-1] = 1;
        }
        for(int i = 0; i < N; ++i){
            if(a[i] == 0) return 0;
        }
        return 1;
	}

	public static void main(String[] args) {
		int[] A = {1,2,3,22,5,6,8,9};
		System.out.println(solution(A,A.length));
		int[] B = {1,3,6,5,4,2};
		System.out.println(solution(B,B.length));
	}
}
