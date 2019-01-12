public class guessMyNumber {
    public void guessMyNumber(int msg){

        int random = (int)(Math.random() * 10 + 0);


        if (random ==  msg){
            System.out.println("u gese !!");
        } else {
            System.out.println("try agean .");
        }
    }
};
