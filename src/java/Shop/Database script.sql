/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  spitzmessera
 * Created: 11.07.2016
 */

\c postgres

drop database if exists webshop;

create database webshop with encoding 'UTF8' template template0 lc_collate 'C' lc_ctype 'C';

\c webshop;

drop table if exists product;

create table product (
    id_product integer primary key,
    netprice float not null,
    productname text not null,
    productdescr text not null,
    manufacturer text not null,
    picturepath text not null,
    stockCount integer not null
);

\encoding UTF8

insert into product values (
    0, 39.39, 'Phalaenopsis', '<p>Die Phalaenopsis entwickelte sich bei uns zum Spitzenreiter unter den Orchideen. Ihre Beliebtheit verdankt sie ihrer langen Blühfreude und ihrer verhältnismäßig leichten Pflege, weshalb sie sich hervorragendals Einstieg für Orchideen&#8208;Neulinge eignet. Die Hybriden sind in zahlreichen Blütenfarben erhältlich,einfarbig in Weiß oder in Gelb&#8208;  oder Rosatönen, sowie in gestreiften und gefleckten Farbkombinationen.</p><p>Phalaenopsis und viele andere Orchideen&#8208;Arten findet man in freier Wildbahn als sogenannte Aufsitzerpflanzen (Epiphyten) auf den Bäumen des südamerikanischen Tropenwaldes. Deswegen fühlen sie sich bei Zimmertemperatur und hoher Luftfeuchtigkeit besonders wohl. Am besten ist ein  heller Platz ohne direkte Sonneneinstrahlung. Meiden Sie deshalb trockene Heizungsluft.</p><h2 class=\"paragraph&#8208;field&#8208;subheadline\">Phalaenopsis richtig gießen</h2><p>Staunässe ist der Tod jeder Phalaenopsis. Wenn Sie gießen, verwenden Sie daher eine Gießkanne mit langem Hals und dünnem Wasserstrahl. Benetzen Sie das Substrat langsam, damit es sich richtig voll saugen kann. Das Wasser sollte immer zimmerwarm sein. Das überschüssige Wasser, das sich im Übertopf oder Untersetzer sammelt, sollten Sie spätestens nach einer halben Stunde leeren. Ein Tauchbad ist im Allgemeinen jedoch die bessere Alternative – vor allem, wenn die Phalaenopsis wegen einer Urlaubsreise zwei Wochen Trockenheit überstehen musste. Tauchen Sie Ihre Orchidee entweder im Spülbecken oder in einer Wanne ins Wasser oder Sie füllen den Ü^bertopf mit Wasser und gießen ihn nach etwa zehn Minuten wieder aus. Es gibt inzwischen spezielle Orchideen&#8208;Ü^bertöpfe mit einer Innenstufe, damit das Gießwasser gut ablaufen kann.</p><h2>Phalaenopsis maßvoll düngen</h2><p>Düngen sollten Sie Orchideen nur mit einem speziellen Orchideendünger, da dieser besonders niedrig dosiert ist. Phalaenopsis müssen in der freien Natur mit minimalen Nährstoffrationen aus der organischen Substanz zersetzter Blätter auskommen, die sich in den Astgabeln ablagern. Daher reagieren sie auf hoch konzentrierte Düngesalze, die sich im Substrat anreichern, sehr empfindlich. Dosieren Sie den Orchideendünger demzufolge im Zweifelsfall lieber etwas geringer als auf der Packung angegeben. Wenn Sie Ihre Phalaenopsis ab und zu in zimmerwarmes Regenwasser tauchen, lagern sich weniger Düngesalze und Kalk im Substrat ab.<br /><h2>Phalaenopsis umtopfen</h2><p>Damit die Orchidee frisches Substrat bekommt, ist etwa alle zwei Jahre Umtopfen angesagt. Verwenden Sie niemals normale Blumenerde, sondern ausschließlich Spezialerde für Orchideen. Sie ist besonders grobkörnig und luftig, so dass keine Staunässe entstehen kann. Der richtige Zeitpunkt zum Umtopfen ist nach der Blüte im Frühjahr. Schneiden Sie gegebenenfalls alle alten und vertrockneten Blätter und Blütenstiele ab. Falls sich die Orchidee schlecht aus dem Topf lösen lässt, können Sie diesen vorsichtig auf dem Tisch her rollen. Achten Sie darauf, dass Sie dabei die Luftwurzeln nicht abbrechen.</p><p>Nun lockern Sie mit den Fingern die Wurzeln und holen das alte Substrat heraus. Alte und faule Wurzeln (gesunde Wurzeln sind graugrün), schneiden Sie vorsichtig mit der Gartenschere heraus. Brechen dabei trotz aller Vorsicht doch ein paar Wurzeln ab, machen Sie sich keine Sorgen: Durch das Umtopfen wird die Wurzelbildung der Phalaenopsis angeregt und ein paar beschädigte Wurzeln verkraften die Pflanzen in der Regel problemlos.<br /><br />\n Der neue Topf für Ihre Phalaenopsis kann genauso groß sein wie der alte. Halten Sie die Orchidee mit der einen Hand so in den Topf, dass sich der Wurzelhals etwa zwei Zentimeter über dem Topfrand befindet. Mit der anderen Hand füllen Sie langsam die frische Orchideen&#8208;Erde ein. Am besten verteilt sie sich, wenn Sie immer wieder leicht am Topf rütteln, so dass die kleinen Bröckchen sich in den Zwischenräumen der Wurzeln absetzen können. Die Phalaenopsis ist dann ausreichend verankert, wenn Sie sie am Wurzelhals samt Topf hochheben können, ohne dass sie sich aus dem Gefäß löst.</p>',
                'Gärtnerei Sommer',
                'Resources/img/phalaenopsis.jpg', 9
);

insert into product values (
    1, 0.59, 'Gänseblümchen', '<p style="text-align:justify;">Das Gänseblümchen ist sowohl ein zartes, sensibles sowie ein kraftvolles, willensstarkes Kraut. Dort, wo es auf Wiesen wächst, läßt es sich selbst durch regelmäßiges Mähen nicht beeindrucken. Wird es abgemäht, so stellt es sich darauf ein und blüht darufhin, um so  schneller, jedoch auf verkürztem Blütenstiel, der so kurz sein kann, daß er vom Rasenmäher nicht mehr geschnitten werden kann. Zudem strahlt die Fortwährend-Schöne, so die Übersetzung des botanischen Namens <em>Bellis perennis</em>, durch ihre Blüte eine sonnengleiche Schönheit aus. Sie blüht fast das ganze Jahr; Voraussetzung ist lediglich, daß die Temperaturen über 0°C sind.</p><p style="text-align:justify;">Verwendet werden können die frischen und getrockneten Blüten und Blätter. Die frischen Blüten schmecken leicht nüssig und ergänzen hervorragend süße wie herzhafte Speisen. Es bietet sich an die Blüten und Blätter im Juni oder Juli zu sammeln, um sie in der Sommersonne zu trocknen.</p><p style="text-align:justify;">Eine weitere bemerkenswerte Eigenart des Gänseblümchen ist, daß sich ihr Blütenkorb am Abend und bei Regen schließt. Sie öffnet sich für die Sonne. Um gepflückte Blüten zu öffnen oder geöffnet zu halten, läßt man sie auf einem Wasserbad in einer Schale schwimmen.</p><p style="text-align:justify;"><strong>Verwendbare Pflanzenteile:</strong></p>
<p style="padding-left:30px;">oberirdische Pflanzenteile</p>
<p><strong>Blütezeit:</strong></p>
<p style="padding-left:30px;">gänzjährig, wenn die Temperatur nur über 0°C ist</p>
<p><strong>Blütenfarbe:</strong></p>
<p style="padding-left:30px;">weiß, teilw. rötlich; gelb</p>
<p><strong>Wuchshöhe:</strong></p>
<p style="padding-left:30px;">10 bis 20 cm</p>
<p><strong>Hauptwirkstoffe:</strong></p>
<p style="padding-left:30px;">Kalium, Calcium, Magnesium, Eisen, Vitamine A, C, ätherische Öle, Gerbstoffe, Saponine, Schleimstoffe, Inulin</p>
<p><strong>Vorkommen:</strong></p>
<p style="padding-left:30px;">auf Wiesen und Rasen, kurz gehaltene Wiesen kommen ihm zugute</p>
<p><strong>Geschmack:</strong></p>
<p style="padding-left:30px;">wie Feldsalat mit nussiger Note</p>
<p><strong>Verwendung als:</strong></p>
<p style="padding-left:30px;">in Salaten und Suppen, sowie Kräutermischungen und Spinat; Blüten als eßbare Dekoration oder leckere Nascherei; für Tee und Saft; Blüten(knospen) wie Kapern eingelegt; Samen ab August gesammelt als Zutat für Salat oder für den Winter zum Keimen</p>
<p><strong>Heilwirkungen:</strong></p>
<p style="padding-left:30px;">stoffwechselanregend, entzündungshemmend, antiviral, schleimlösend, blutreinigend, schmerzlindernd; Tee wird volksmedizinisch zur Stärkung von Lunge, Leber, Magen und Blase angewandt; Wundumschlag zur Schmerzlinderung und Heilungsbeschleunigung, auch bei Ausschlägen und Insektenstichen; in der Homöopathie zur Gewebestraffung</p>
<p><strong>Verwechslungsmöglichkeit:</strong></p>
<p style="padding-left:30px;">Das blühende Gänseblümchen ist eigentlich unverwechselbar.</p>
<p><strong>Weitere Namen:</strong></p>
<p style="padding-left:30px;">Tausendschön(chen), Maßlieb(chen), Matfüßchen (Bergisch), Maßblümlein, Angerbleaml (Niederösterreich), Angerrösl (Niederösterreich), Augenblume, Blächblume (Nahe), Konrädchen (Hessen), Marienblümchen (Tirol), Mairöserl, Maiblume, Osterblume, Mondscheinblume, Margeretenblume, Margenblume (Unterweser), Morgenblume, Frueblümlein (Schlesien), Mannablümli (St. Gallen),  Geißeblümli (Glattal), Müllerblümli (Glattal), Winterröschen, Himmelsblume, Monatsblümchen, Regenblume, Mümmeli, Ruckerl (Österreich), Rockerl (Österreich), Zeitlose; franz.: pâquerette; engl.: daisy; botanisch: <em><em>Bellis perennis</em></em> L.<em><br />
</em></p>
<p style="text-align:justify;">Die sonnengleiche Schönheit drückt sich ebenfalls im isländischen Namen <em>baldrsbra</em> (Braue des der Sonne zugeordneten germanischen <em>Gottes</em> Baldur) aus. Gänse hingegen essen das Gänseblümchen nicht. Sie lassen es auf der Wiese stehen.</p>'
, 'Wildwuchs GmbH', 'Resources/img/gaensebluemchen.png', 2
);

insert into product values (
2, 3.00, 'Rosen', '<h3>Erscheinungsbild</h3>
<p style="text-align: justify;">
Die Rosen-Arten sind sommergrüne, selten immergrüne Sträucher. Ihre selbständig aufrechten oder kletternden Sprossachsen sind bis zu 4 Meter hoch. Am Boden aufliegende Sprossachsen werden länger, manche sind niederliegend oder kriechend. Viele Arten entwickeln verholzte Bodenausläufer und bilden dann Kolonien. Die Sprossachsen können mit Drüsen oder Haaren besetzt sein, beides kann auch fehlen. Das Vorhandensein von Drüsen ist mit mehr oder weniger starkem Duft gekoppelt. Die Behaarung (Indument) kann alle oberirdischen Organe (mit Ausnahme der Hagebutten und Staubblätter) betreffen, die Form, Zahl und Verteilung der Haare ist charakteristisch für bestimmte Sippen, wobei die Behaarung ein ontogenetisch konstantes Merkmal ist (Verkahlen im Alter ist sehr selten).
</p>
<h3>Stacheln</h3>
<p style="text-align: justify;">
Stamm, Äste und Zweige sind mit Stacheln besetzt, die im Volksmund häufig als Dornen bezeichnet werden. Die Stacheln dienen zum einen als Schutz gegen Tierfraß, zum anderen bei Spreizklimmern zum Festhalten an den Stützen. Die Stacheln können bei einer Pflanze gleichartig (homoeacanth) oder verschiedenartig (heteracanth) sein. Dabei ist häufig die Form an Kurztrieben anders als an Langtrieben. Die bodennahen Bereiche sind oft besonders reich an Stacheln. Die Grundtypen werden als hakig, sichelig, leicht gekrümmt, gerade, Nadelstachel und Stachelborste bezeichnet; es kommen Zwischenformen vor.
</p>
<h3>Blätter</h3>
<p style="text-align: justify;">
Die wechselständig und in 2/5-Stellung stehenden Laubblätter sind mehr oder weniger lang gestielt. Die unpaarig gefiederte Blattspreite besteht aus meist fünf bis neun Fiederblättchen, es können drei bis 19 sein. Lediglich bei Rosa persica sind die Laubblätter einfach und die Nebenblätter fehlen. Auch bei den Blättern können Drüsen und Haare vorkommen oder auch fehlen. An der Blattspindel (Rhachis) sitzen manchmal kleine Stacheln oder Stachelborsten. Die Fiederblättchen sind sehr unterschiedlich gestaltet, meist sind sie elliptisch bis eiförmig, verkehrt-eiförmig oder rundlich. Der Blättchenrand ist – regelmäßig oder unregelmäßig – einfach oder mehrfach gesägt, seltener gekerbt oder annähernd ganzrandig. Nebenblätter sind vorhanden.
</p>
<h3>Blütenstände und Blüten</h3>
<p style="text-align: justify;">
Die Blüten stehen end- oder seitenständig in traubigen, rispigen, manchmal doldig verkürzten Blütenständen. Der Blütenstand kann auch auf eine einzelne Blüte reduziert sein. Hochblätter werden gebildet, selten sind sie hinfällig oder fehlen. Ein Außenkelch wird nicht gebildet. Die gestielten bis sitzenden Blüten sind meist ansehnlich und häufig duftend. Die zwittrigen Blüten sind radiärsymmetrisch und meist fünfzählig mit doppelter Blütenhülle. Es gibt fünf Kelchblätter, nur bei Rosa sericea[1] vier. Sie sind meist lanzettlich, laubblattartig, ungeteilt oder es sind die beiden äußeren auf beiden Seiten und das mittlere auf einer Seite geteilt: fiederteilig, -schnittig oder -spaltig. Auch der Kelch kann behaart oder mit Drüsen besetzt sein. Er ist nach der Blüte zurückgeschlagen, abstehend oder aufgerichtet; zur Fruchtreife ist er bereits abgefallen, abfallend (fällt etwa zur Fruchtreife ab) oder krönt die Frucht. Der Durchmesser der Blütenkrone beträgt meist 3 bis 7 Zentimeter, kann aber auch zwischen 1 und 10 Zentimeter liegen. Die fünf (bei einer Art vier) Kronblätter sind hinfällig, ihre Farbe ist meist rosa bis rot, oder weiß, seltener gelb, etwa bei nicht-mitteleuropäischen Arten und Kulturrosen. Bei vielen Kulturformen ist die Blüte durch Umwandlung von Staubblättern in Kronblätter gefüllt. Längsschnitt durch den Blütenbecher; im oberen Bereich der Griffelkanal, durch den die Griffel nach außen ragen. Der je nach Art unterschiedlich geformte Blütenbecher ist mehr oder weniger urnenförmig, drüsig oder drüsenlos, manchmal stachelborstig. Der obere Bereich des Blütenbechers ist verengt und als Diskus ausgebildet: er ist dem nektarbildenden Drüsenring anderer Gattungen homolog, bildet jedoch nur bei wenigen Rosenarten Nektar. In der Mitte des Diskus öffnet sich der Griffelkanal: durch ihn treten die Griffelbündel ins freie, die Narbenköpfe stehen hier halbkugelig bis straußförmig. Sie können dem Diskus aufliegen oder deutlich über ihn hinausragen. Die Anzahl der Staubblätter ist bei den Rosen wie bei vielen Rosengewächsen durch sekundäre Polyandrie erhöht, es sind meist 50 bis 200, selten 20 bis 265 vorhanden. Sie stehen vor den Kronblättern (epipetal) und setzen am Rande des Blütenbechers an. Die Staubbeutel sind nach innen gerichtet, von gelber bis oranger oder brauner Farbe. Die Staubfäden haben meist eine davon abweichende Färbung und sind meist weiß oder strohgelb. Der Pollen ähnelt im Aufbau stark dem Pollen von Rubus: das Pollenkorn hat drei Furchen (tricolpat), seine Oberfläche ist rugulat-striat (hat kürzere bis längere, mehr oder weniger parallel laufende Rippen), im Gegensatz zu Rubus jedoch ein Operculum. Der Rosenpollen ist bei vielen Arten größer als 25 Mikrometer. Nur ein Teil des Pollen ist fertil, besonders in der Sektion Caninae sind verformte, geschrumpfte Pollenkörner häufig. Es gibt zahlreiche, nicht verwachsene Fruchtblätter. Ihre Zahl liegt meist zwischen 10 und 50, kann aber auch 4 bis 140 betragen. Sie sitzen am Grund oder an der Wand des Blütenbechers, oder sind kurz gestielt. Jedes Fruchtblatt trägt ein bis zwei Samenanlagen. Der Griffel setzt seitlich oder selten endständig an. Die Griffel sind frei, bei wenigen Arten sind sie miteinander verwachsen. Die Narbe ist kopfig, behaart oder kahl.
</p>
<h3>Früchte</h3>
<p style="text-align: justify;">
Die Frucht der Rosen ist die Hagebutte: sie ist eine Sammelnussfrucht. Die Einzelfrüchte sind einsamige Nüsschen von gelber bis brauner Farbe. Sie sind vom mehr oder weniger fleischigen, vergrößerten Blütenbecher umgeben, der innen oft behaart ist. In reifem Zustand ist die Hagebutte fleischig bis ledrig, weich bis hart. Sie kann sich lange an der Pflanze halten oder früh abfallen. Zur Fruchtreife ist sie häufig rot bis orange, in seltenen Fällen braun bis schwarz. Die Einzelfrucht – das Nüsschen, oft als „Kern“ bezeichnet – ist meist drei bis sechs, selten zwischen 2,5 und acht Millimeter lang, 2,5 bis 3,5 (selten zwei bis sechs) Millimeter breit, stark behaart bis annähernd kahl. Die Anzahl der Nüsschen liegt bei mitteleuropäischen Arten meist zwischen 10 und 30 pro Hagebutte, selten zwischen 1 und 45. Bei Rosa rugosa sind es über 100, bei Rosa clinophylla bis 150. Die Anzahl hängt auch von der Art der Samenbildung ab: die Zahl sinkt von echter Fremdbefruchtung, Nachbarbefruchtung über Selbstbefruchtung bis zur Apomixis, bei der die wenigsten Samen gebildet werden. Die Nüsschen werden durch Zerfall der Hagebutte im Winter bis Sommer des Folgejahres frei oder durch die Zerstörung der Hagebutte durch Tiere verbreitet.
</p>', 'Wildwuchs GmbH', '', 20
);