public class BreakContinueJava {

    public static void main(String[] args){
    /*
    Java Break
    You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

    The break statement can also be used to jump out of a loop.

    This example stops the loop when i is equal to 4:
    */

    // break
    for (int i = 1; i <= 5; i++){
        if(i == 4){
            break;
        }

        //System.out.println(i);
    }

    // continue
    for (int j = 1; j <= 5; j++){
        if(j == 4){
            continue;
        }

        System.out.println(j);
    }

    int k = 1;

    while( k <= 5){
        System.out.println(k);
        k++;
        
        if(k == 4){
            break;
        }
       
    }

    int t = 1;

    while( t <= 5){
        System.out.println(t);
        t++;

        if(t == 3){
            continue;
        }
    
    }

    }

    
    
}
