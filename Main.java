class Main { 
    public static void main(String[] args) {
        int n = 1;
        int m = 50;
        System.out.println("Sum Odd number("+n+","+m+") :" + sumOddValue(n,m));
        System.out.println("Sum Even number("+n+","+m+") :" + sumEvenValue(n,m));
    }
    static int sumOddValue(int a, int b){
    int result = 0;
    for (int i =a; i <=b; i++){
        if(i%2 !=0){
            result +=i;
        }
    }
    return result;
} 
    static int sumEvenValue(int a, int b){
    int result = 0;
    for (int i =a; i <=b; i++){
        if(i%2 == 0){
            result +=i;
        }
    }
    return result;
    
}

}