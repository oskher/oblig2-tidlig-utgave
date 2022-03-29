package webprog.oblig2osk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// Restcontroller skal stå utenfor public class:
public class Oblig2OskController {
    public final List<Billetter> alleBilletter = new ArrayList<>();

    @PostMapping ("/lagre")
    public void registrer(Billetter dataFraHtml){
        alleBilletter.add(dataFraHtml);
    }

    @GetMapping ("/printUt")
    public List<Billetter> printUt(){
        return alleBilletter;
    }

    @GetMapping ("/slettAlle")
    public void slett(){
        alleBilletter.clear();
    }

}

