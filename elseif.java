public class elseif {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 13 && age <= 18) {
            System.out.println("you are a teenager");
        } else {
            System.out.println("You are not allowed without parent consent");
        }
    }
    /*
     * This code was a bit tricky I need t remember certain details revisions of
     * this code is really necessary.
     * The mistakes I made was:
     * 1. In the first if statement I need to know bout the datatype I am about to
     * enter must be correct
     * 2. elseif only gets checked if the original if statement false.
     * 3. In the last else statement there is no formulae added into the condition
     * just results are declared remember this.
     */
}
