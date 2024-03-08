import java.util.Scanner;

public class VoteProgram {
    
    //Input: only the type of vote and the movie the user wants to see the percentage too
    //output: The movie that won (tie if all votes are equal) and the percentage and name of movie that the user wants to see
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        int voteCount = 0;
        int boy = 0;
        int elemental = 0;
        int nimona = 0;
        int robot = 0;
        int spider = 0;
        int vote = 0;
        boolean keepCounting = true;
        
        do{   
                
            int checkedVote = checkVote(sk, vote);

            if(checkedVote == 1){
                boy++;
            }else if(checkedVote ==2){
                elemental++;
            }else if(checkedVote ==3){
                nimona++;  
            }else if(checkedVote ==4){
                robot++;
            }else if(checkedVote ==5){
                spider++;
            }else if(checkedVote == 6){
                keepCounting = false;
                voteCount--;
            }

            voteCount++;
        }while(voteCount!=500000 && keepCounting);

        String max = "";

        if(boy == elemental && boy == nimona && boy == robot && boy == spider){
            System.out.print("Hubo un empate entre todas las peliculas");
        }else {
            if(boy >= elemental && boy >= nimona && boy >= robot && boy >= spider){
                max = "El chico y la garza";
            } else if(elemental >= boy && elemental >= nimona && elemental >= robot && elemental >= spider){
                max = "Elemental";
            } else if(nimona >= elemental && nimona >= boy && nimona >= robot && nimona >= spider){
                max = "Nimona";
            }else if(robot >= elemental && robot >= nimona && robot >= boy && robot >= spider){
                max = "Robot Dreams";
            }else{
                max = "Spider-Man: Cruzando el Multiverso";
            }
            System.out.println("\nEl ganador fue: "+ max);
        }


        System.out.print("\nLa cantidad total de votos fue: " + voteCount);

        calcPercent(sk, boy, elemental, nimona, robot, spider, voteCount);

        sk.close();
    }


    //input: scanner
    //prerequisites: non
    //Poscondition: the menu is printed
    //parameters: scanner
    //Return: none
    public static int menu(Scanner sk) {
        System.out.print("\nIngrese su voto:\n\t1. El chico y la garza\n\t2. Elemental");
        System.out.print("\n\t3. Nimona\n\t4. Robot Dreams\n\t5. Spider-Man: Cruzando el Multiverso");
        System.out.println("\nSi desea salir la ultima opcion:\n\t6. Terminar las votaciones");
        System.out.print("Su voto: ");

        int vote = sk.nextInt();
        sk.nextLine();

        return vote;
    }

    //input: scanner, vote
    //prerequisites: vote should be an int
    //Poscondition: it returns a valid vote (number between 1 and 6)
    //parameters: scanner, vote
    //Return: movie that the user voted for

    public static int checkVote(Scanner sk, int vote){

        boolean checkSk = true;

        do{
            vote = menu(sk);

            if(!(vote==1||vote==2||vote==3||vote==4||vote==5||vote==6)){
                System.out.print("El valor debe ser del 1 - 6. Intente de nuevo.");
                checkSk = true;
            } else{
                checkSk = false;
            }
        }while(checkSk);
        
        return vote;

    }


    //input: scanner, bot, elemental, nimona, robot, spider, votes
    //prerequisites: all inputs should be ints except scanner
    //Poscondition: It returns the name of the movie that won and the percentage of votes it got
    //parameters: scanner, boy, elemental, nimona, robot, spider, votes
    //Return: movie selected and percentage
    public static void calcPercent(Scanner sk,int boy, int elemental, int nimona, int robot, 
    int spider, double votes){

        double percent = 0.0;
        String name = "";

        System.out.print("\n " + boy + " "+ elemental + " "+ nimona + " "+ robot + " " + spider + " ");

        System.out.print("\nIngrese una pelicula para ver su porcentaje de votacion: ");

        String movie = sk.nextLine();

        if(movie.equalsIgnoreCase("el chico y la garza")) {
            percent = (boy/votes)*100;
            name = "El chico y la garza";
        }else if(movie.equalsIgnoreCase("elemental")){
            percent = (elemental/votes)*100;
            name = "Elemental";
        }else if(movie.equalsIgnoreCase("nimona")){
            percent = (nimona/votes)*100;
            name = "Nimona";
        }else if(movie.equalsIgnoreCase("robot dreams")){
            percent = (robot/votes)*100;
            name = "Robot Dreams";
        }else if(movie.equalsIgnoreCase("spider-man: cruzando el multiverso")){
            percent = (spider/votes)*100;
            name = "Spider-Man: Cruzando el Multiverso";
        } else {
            name = "NO EXISTE";
        }

        System.out.printf("El porcentaje de votacion de %s fue del %.2f%%",name,percent);
    }
}