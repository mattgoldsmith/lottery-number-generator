import java.util.ArrayList;
import java.util.Collections;

public class Numbers {

    private final ArrayList<String> numbers;

    public Numbers() {
        numbers = new ArrayList<>();
        setNumbers();
    }

    private void setNumbers() {
        Collections.addAll(numbers,
        /* 2022 */
        "157196"
        ,"845093"
        ,"375805"
        ,"121789"
        ,"913106"
        ,"613106"
        ,"484669"
        ,"943703"
        ,"929332"
        ,"331583"
        ,"436594"
        ,"620405"
        ,"981417"
        ,"361807"
        ,"319196"
        ,"155012"
        ,"658642"
        ,"395919"
        ,"970618"
        ,"737867"
        ,"061905"
        ,"098597"
        ,"944308"
        ,"880159"
        /* 2021 */
        ,"819068"
        ,"639235"
        ,"077258"
        ,"032761"
        ,"045037"
        ,"386372"
        ,"578171"
        ,"070935"
        ,"114475"
        ,"046750"
        ,"910261"
        ,"556725"
        ,"713517"
        ,"691861"
        ,"292972"
        ,"684579"
        ,"501272"
        ,"100787"
        ,"472270"
        ,"890422"
        ,"835538"
        ,"424603"
        ,"912307"
        ,"384395");
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }
}
