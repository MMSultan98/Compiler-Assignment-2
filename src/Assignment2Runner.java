import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Assignment2Runner {
    
    /**
     * Parses a provided string using the grammar
     * and gets the value of the attribute "check" of the variable "s'
     *
     * @param input a string to parse
     * @return the value of the attribute "check" of the variable "s'
     */
    public static int sCheckValue(String input) {
        Assignment2Lexer lexer = new Assignment2Lexer(CharStreams.fromString(input));
        Assignment2Parser parser = new Assignment2Parser(new CommonTokenStream(lexer));
        return parser.s().check;
    }

    public static void main(String[] args) {
        // check = 0
        System.out.println("Check = 0:");
        System.out.println(sCheckValue("(aUa)"));
        System.out.println(sCheckValue("((aUb)Ua)"));
        System.out.println(sCheckValue("((a.a)Ub)"));
        System.out.println(sCheckValue("((a.a)U(e.e))"));
        System.out.println(sCheckValue("((a.a)U(b.e))"));
        System.out.println(sCheckValue("((bUb)U(aUb))"));
        System.out.println(sCheckValue("(((b.b)Ue)U(aUb))"));
        System.out.println(sCheckValue("(((b.b)Ue)U(((b*).b)Ua))"));

        System.out.println();

        // check = 1
        System.out.println("Check = 1:");
        System.out.println(sCheckValue("e"));
        System.out.println(sCheckValue("a"));
        System.out.println(sCheckValue("b"));
        System.out.println(sCheckValue("(aUb)"));
        System.out.println(sCheckValue("((aUb)Ub)"));
        System.out.println(sCheckValue("((aUb)U(b.a))"));
        System.out.println(sCheckValue("((aUb)U(b*))"));
        System.out.println(sCheckValue("((aUb)U(aUb))"));
        System.out.println(sCheckValue("((a.a)U(b.b))"));
        System.out.println(sCheckValue("((bUa)U(aUb))"));
        System.out.println(sCheckValue("(((b.b)Ue)U(eUa))"));
        
    }

}
