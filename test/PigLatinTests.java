import com.company.PigLatin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("igPay atinlay siay oolcay hisTay siay ymay tringsay ctaAay steay abulafay arbaBay onnay acitfay hilosophumpay ctaAay steay abulafay ucullusCay onnay acitfay onachummay uraDay exlay edsay exlay rrareEay umanumhay steay luctuatFay ecnay ergiturmay uttaGay avatcay apidemlay icHay teay uncnay nIay inovay eritasvay uxLay niay enebristay ucetlay orituriMay olumusnay orimay orituriMay olumusnay orimay uncNay steay ibendumbay emporatay oresmay", PigLatin.pigIt("Pig latin is cool This is my string Acta est fabula Barba non facit philosophum Acta est fabula Cucullus non facit monachum Dura lex sed lex Errare humanum est Fluctuat nec mergitur Gutta cavat lapidem Hic et nunc In vino veritas Lux in tenebris lucet Morituri nolumus mori Morituri nolumus mori Nunc est bibendum tempora mores"));
    }
}