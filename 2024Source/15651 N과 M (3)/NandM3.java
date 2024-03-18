import java.io.*;
import java.util.StringTokenizer;

public class NandM3 {

    static int N,M;
    static int[] selected ;
    static StringBuilder sb = new StringBuilder();

    static void input(){
        FastReader Fr = new FastReader();
        N = Fr.nextInt();
        M = Fr.nextInt();
        selected = new int[M+1];
    }

    static void recur(int k){
        if(k==M+1){
            for (int j = 1 ; j < M+1; j++ ) sb.append(selected[j]).append(' ');
            sb.append('\n');
        }else{
            for (int i = 1; i <= N ; i++){
                selected[k] = i;
                recur(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        recur(1);
        System.out.println(sb.toString());
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
