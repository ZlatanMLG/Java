import java.util.Scanner;
public class Lab5  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "Somebody once told me the world is gonna roll me.\n" +
                "I ain't the sharpest tool in the shed." + '\n'+
                "She was looking kind of dumb with her finger and her thumb." + '\n'+
                "In the shape of an L on her forehead." + '\n';
        System.out.print(text);
        Text str = new Text(text);
        str.ObjSplit();
        try {
            System.out.print("Enter length of word: ");
            int dlin = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter correction: ");
            String corr = scan.nextLine();
            System.out.print("\n");
            str.Execute(dlin,corr);

        }
        catch (java.util.InputMismatchException e){
            System.out.println("Enter an integer");
        }
    }
}


