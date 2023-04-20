public class Exercise1 {

    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main(String[] args) throws Exception {

        // precondition
        assert iwillBehave == true: "Bakit ka kasi nagpaka-bad boy";

        //method
        College();

        // post condition
        assert IwillGraduate == true: "'Bakit ka kasi nagpa-busted nung 4th year'";
    }

    static void College(){
    IwillGraduate = false;
    System.out.println("Wohoo grumaduate ako");
    }
}
