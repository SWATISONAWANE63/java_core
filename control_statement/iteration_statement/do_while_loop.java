public class do_while_loop {
    public static void main(String[] args) {
        // int i = 1;
        // do { 
        //     System.out.println(i);
        //     i++;

        // } while (i <= 10);
    // int num=5;
    // for(int i=0; i<=num; i++){
    //     for(int j=0; j<i;j++ ){
    //         System.out.print("*");
           
    //     }
    //     System.out.println();
    // }
    // }
    for(int i=1; i<=5; i++){
        if(i==4){
            continue;
        }
        System.out.println(i);
    }

    for(int i=1; i<=5; i++){
        if(i==4){
           break;
        }
        System.out.println(i);
    }

}

}