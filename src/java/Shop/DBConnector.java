/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class DBConnector {

    public DBConnector() {
    }

    public List<Product> GetResult() {
        ArrayList<Product> products = new ArrayList<>();
        String imageDir = "Resources/img/";

        products.add(new Product(0, "Phalaenopsis", "Gärtnerei Sommer", 39.39, "<p>Die Phalaenopsis entwickelte sich bei uns zum Spitzenreiter unter den Orchideen. Ihre Beliebtheit\n"
                + "verdankt sie ihrer langen Bl&uuml;hfreude und ihrer verh&auml;ltnism&auml;&szlig;ig leichten Pflege, weshalb sie sich hervorragend\n"
                + "als Einstieg f&uuml;r Orchideen-Neulinge eignet. Die Hybriden sind in zahlreichen Bl&uuml;tenfarben erh&auml;ltlich,\n"
                + "einfarbig in Wei&szlig; oder in Gelb-  oder Rosat&ouml;nen, sowie in gestreiften und gefleckten Farbkombinationen.</p>"
                + "<p>Phalaenopsis und viele andere Orchideen-Arten findet man in freier Wildbahn als sogenannte Aufsitzerpflanzen (Epiphyten) auf den Bäumen des "
                + "südamerikanischen Tropenwaldes. Deswegen fühlen sie sich bei Zimmertemperatur und hoher Luftfeuchtigkeit besonders wohl. Am besten ist ein "
                + " heller Platz ohne direkte Sonneneinstrahlung. Meiden Sie deshalb trockene Heizungsluft.</p>"
                + "<h2 class=\"paragraph-field-subheadline\">Phalaenopsis richtig gießen</h2>"
                + "<p>Staunässe ist der Tod jeder Phalaenopsis. Wenn Sie gießen, verwenden Sie daher eine "
                + "Gießkanne mit langem Hals und dünnem Wasserstrahl. Benetzen Sie das Substrat langsam, damit es sich richtig voll saugen kann. Das Wasser "
                + "sollte immer zimmerwarm sein. Das überschüssige Wasser, das sich im Übertopf oder Untersetzer sammelt, sollten Sie spätestens nach einer "
                + "halben Stunde leeren. Ein Tauchbad ist im Allgemeinen jedoch die bessere Alternative – vor allem, wenn die Phalaenopsis wegen einer "
                + "Urlaubsreise zwei Wochen Trockenheit überstehen musste. Tauchen Sie Ihre Orchidee entweder im Spülbecken oder in einer Wanne ins Wasser oder "
                + "Sie füllen den Übertopf mit Wasser und gießen ihn nach etwa zehn Minuten wieder aus. Es gibt inzwischen spezielle Orchideen-Übertöpfe mit einer "
                + "Innenstufe, damit das Gießwasser gut ablaufen kann.</p>"
                + "<h2>Phalaenopsis maßvoll düngen</h2>"
                + "<p>Düngen sollten Sie Orchideen nur mit einem speziellen "
                + "Orchideendünger, da dieser besonders niedrig dosiert ist. Phalaenopsis müssen in der freien Natur mit minimalen Nährstoffrationen aus der organischen "
                + "Substanz zersetzter Blätter auskommen, die sich in den Astgabeln ablagern. Daher reagieren sie auf hoch konzentrierte Düngesalze, die sich im Substrat "
                + "anreichern, sehr empfindlich. Dosieren Sie den Orchideendünger demzufolge im Zweifelsfall lieber etwas geringer als auf der Packung angegeben. Wenn Sie "
                + "Ihre Phalaenopsis ab und zu in zimmerwarmes Regenwasser tauchen, lagern sich weniger Düngesalze und Kalk im Substrat ab.<br />"
                + "<h2>Phalaenopsis umtopfen</h2>"
                + "<p>Damit die Orchidee frisches Substrat bekommt, ist etwa alle zwei Jahre Umtopfen angesagt. Verwenden Sie niemals normale Blumenerde, sondern "
                + "ausschließlich Spezialerde für Orchideen. Sie ist besonders grobkörnig und luftig, so dass keine Staunässe entstehen kann. Der richtige Zeitpunkt "
                + "zum Umtopfen ist nach der Blüte im Frühjahr. Schneiden Sie gegebenenfalls alle alten und vertrockneten Blätter und Blütenstiele ab. Falls sich die "
                + "Orchidee schlecht aus dem Topf lösen lässt, können Sie diesen vorsichtig auf dem Tisch her rollen. Achten Sie darauf, dass Sie dabei die Luftwurzeln "
                + "nicht abbrechen.</p>"
                + "<p>Nun lockern Sie mit den Fingern die Wurzeln und holen das alte Substrat heraus. Alte und faule Wurzeln (gesunde Wurzeln sind graugrün), schneiden "
                + "Sie vorsichtig mit der Gartenschere heraus. Brechen dabei trotz aller Vorsicht doch ein paar Wurzeln ab, machen Sie sich keine Sorgen: Durch das "
                + "Umtopfen wird die Wurzelbildung der Phalaenopsis angeregt und ein paar beschädigte Wurzeln verkraften die Pflanzen in der Regel problemlos.<br /><br "
                + "/>\n Der neue Topf für Ihre Phalaenopsis kann genauso groß sein wie der alte. Halten Sie die Orchidee mit der einen Hand so in den Topf, dass sich "
                + "der Wurzelhals etwa zwei Zentimeter über dem Topfrand befindet. Mit der anderen Hand füllen Sie langsam die frische Orchideen-Erde ein. Am besten "
                + "verteilt sie sich, wenn Sie immer wieder leicht am Topf rütteln, so dass die kleinen Bröckchen sich in den Zwischenräumen der Wurzeln absetzen können. "
                + "Die Phalaenopsis ist dann ausreichend verankert, wenn Sie sie am Wurzelhals samt Topf hochheben können, ohne dass sie sich aus dem Gefäß löst.</p>",
                imageDir + "phalaenopsis.jpg", 9));
        products.add(new Product(1, "Abc", "abcd", 999.12,
                "",
                imageDir + "test.jpg", 0));
        products.add(new Product(2, "Test", "Test AG", 9.99, "Ich bin ein Test", imageDir + "test.jpg", 9));
        products.add(new Product(3, "Test", "Test AG", 9.99, "Ich bin ein Test", imageDir + "test.jpg", 9));
        products.add(new Product(4, "Test", "Test AG", 9.99, "Ich bin ein Test", imageDir + "test.jpg", 9));

        return products;
    }
}