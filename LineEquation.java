public class LineEquation {
    public static void main(String []args){
        int n=7;
        for(int i=0; i<=n-1; ++i){
            // FOR J
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR A
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR V
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==j && j<=n/2|| i+j==n-1 && j>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR A
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR I
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            // FOR S
               System.out.print(" ");
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR M
            for(int j=0; j<=n-1; ++j){
               if(j==0|| j==n-1|| i==j && i<=n/2|| i+j==n-1 && i<=n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Z
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i+j==n-1|| i==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
               System.out.println();
        }
        System.out.println();
        for(int i=0; i<=n-1; ++i){
            System.out.print(" ");
            // FOR P
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR O
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR U
            for(int j=0; j<=n-1; ++j){
               if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR D
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1|| j==0|| j==n-1 && i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR Q
            for(int j=0; j<=n-1; ++j){
               if((i==0 && j!=0 && j<=n/2)|| (j==0 && i!=0 && i<=n/2) || (i==j && i>=n/2)||(i==n/2+1 && j!=0 && j<=n/2)||(j==n/2+1 && i!=0 && i<=n/2)){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR T
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR S
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.println( );
        }
        System.out.println();
        for(int i=0; i<=n-1; ++i){
            System.out.print(" ");
            // FOR T
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR H
            for(int j=0; j<=n-1; ++j){
               if(j==0|| j==n-1|| i==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR A
            for(int j=0; j<=n-1; ++j){
               if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR N
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i==j|| j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR K
            for(int j=0; j<=n-1; ++j){
               if(j==0|| i-j==n/2|| i+j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR Y
            for(int j=0; j<=n-1; ++j){
               if(i==j && i<=n/2|| i+j==n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR O
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR U
            for(int j=0; j<=n-1; ++j){
               if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR G
            for(int j=0; j<=n-1; ++j){
               if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            // FOR S
            for(int j=0; j<=n-1; ++j){
               if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR I
            for(int j=0; j<=n-1; ++j){
               if(i==0|| i==n-1|| j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.print(" ");
            // FOR R
            for(int j=0; j<=n-1; ++j){
               if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
            }
            System.out.println( );
        }
        }
}
