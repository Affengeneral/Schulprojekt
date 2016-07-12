/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  spitzmessera
 * Created: 11.07.2016
 */

-- drop database if exists webshop;

-- create database webshop;

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

insert into product values (
    0, 39.39, 'Phalaenopsis', '<p>Die Phalaenopsis entwickelte sich bei uns zum Spitzenreiter unter den Orchideen. Ihre Beliebtheitverdankt sie ihrer langen Bl&uuml;hfreude und ihrer verh&auml;ltnism&auml;&szlig;ig leichten Pflege, weshalb sie sich hervorragendals Einstieg f&uuml;r Orchideen&#8208;Neulinge eignet. Die Hybriden sind in zahlreichen Bl&uuml;tenfarben erh&auml;ltlich,einfarbig in Wei&szlig; oder in Gelb&#8208;  oder Rosat&ouml;nen, sowie in gestreiften und gefleckten Farbkombinationen.</p><p>Phalaenopsis und viele andere Orchideen&#8208;Arten findet man in freier Wildbahn als sogenannte Aufsitzerpflanzen (Epiphyten) auf den B&auml;umen des s&uuml;damerikanischen Tropenwaldes. Deswegen f&uuml;hlen sie sich bei Zimmertemperatur und hoher Luftfeuchtigkeit besonders wohl. Am besten ist ein  heller Platz ohne direkte Sonneneinstrahlung. Meiden Sie deshalb trockene Heizungsluft.</p><h2 class=\"paragraph&#8208;field&#8208;subheadline\">Phalaenopsis richtig gie&szlig;en</h2><p>Staun&auml;sse ist der Tod jeder Phalaenopsis. Wenn Sie gie&szlig;en, verwenden Sie daher eine Gie&szlig;kanne mit langem Hals und d&uuml;nnem Wasserstrahl. Benetzen Sie das Substrat langsam, damit es sich richtig voll saugen kann. Das Wasser sollte immer zimmerwarm sein. Das &uuml;bersch&uuml;ssige Wasser, das sich im &Uuml;bertopf oder Untersetzer sammelt, sollten Sie sp&auml;testens nach einer halben Stunde leeren. Ein Tauchbad ist im Allgemeinen jedoch die bessere Alternative – vor allem, wenn die Phalaenopsis wegen einer Urlaubsreise zwei Wochen Trockenheit &uuml;berstehen musste. Tauchen Sie Ihre Orchidee entweder im Sp&uuml;lbecken oder in einer Wanne ins Wasser oder Sie f&uuml;llen den &Uuml;^bertopf mit Wasser und gie&szlig;en ihn nach etwa zehn Minuten wieder aus. Es gibt inzwischen spezielle Orchideen&#8208;&Uuml;^bert&ouml;pfe mit einer Innenstufe, damit das Gie&szlig;wasser gut ablaufen kann.</p><h2>Phalaenopsis ma&szlig;voll d&uuml;ngen</h2><p>D&uuml;ngen sollten Sie Orchideen nur mit einem speziellen Orchideend&uuml;nger, da dieser besonders niedrig dosiert ist. Phalaenopsis m&uuml;ssen in der freien Natur mit minimalen N&auml;hrstoffrationen aus der organischen Substanz zersetzter Bl&auml;tter auskommen, die sich in den Astgabeln ablagern. Daher reagieren sie auf hoch konzentrierte D&uuml;ngesalze, die sich im Substrat anreichern, sehr empfindlich. Dosieren Sie den Orchideend&uuml;nger demzufolge im Zweifelsfall lieber etwas geringer als auf der Packung angegeben. Wenn Sie Ihre Phalaenopsis ab und zu in zimmerwarmes Regenwasser tauchen, lagern sich weniger D&uuml;ngesalze und Kalk im Substrat ab.<br /><h2>Phalaenopsis umtopfen</h2><p>Damit die Orchidee frisches Substrat bekommt, ist etwa alle zwei Jahre Umtopfen angesagt. Verwenden Sie niemals normale Blumenerde, sondern ausschlie&szlig;lich Spezialerde f&uuml;r Orchideen. Sie ist besonders grobk&ouml;rnig und luftig, so dass keine Staun&auml;sse entstehen kann. Der richtige Zeitpunkt zum Umtopfen ist nach der Bl&uuml;te im Fr&uuml;hjahr. Schneiden Sie gegebenenfalls alle alten und vertrockneten Bl&auml;tter und Bl&uuml;tenstiele ab. Falls sich die Orchidee schlecht aus dem Topf l&ouml;sen l&auml;sst, k&ouml;nnen Sie diesen vorsichtig auf dem Tisch her rollen. Achten Sie darauf, dass Sie dabei die Luftwurzeln nicht abbrechen.</p><p>Nun lockern Sie mit den Fingern die Wurzeln und holen das alte Substrat heraus. Alte und faule Wurzeln (gesunde Wurzeln sind graugr&uuml;n), schneiden Sie vorsichtig mit der Gartenschere heraus. Brechen dabei trotz aller Vorsicht doch ein paar Wurzeln ab, machen Sie sich keine Sorgen: Durch das Umtopfen wird die Wurzelbildung der Phalaenopsis angeregt und ein paar besch&auml;digte Wurzeln verkraften die Pflanzen in der Regel problemlos.<br /><br />\n Der neue Topf f&uuml;r Ihre Phalaenopsis kann genauso gro&szlig; sein wie der alte. Halten Sie die Orchidee mit der einen Hand so in den Topf, dass sich der Wurzelhals etwa zwei Zentimeter &uuml;ber dem Topfrand befindet. Mit der anderen Hand f&uuml;llen Sie langsam die frische Orchideen&#8208;Erde ein. Am besten verteilt sie sich, wenn Sie immer wieder leicht am Topf r&uuml;tteln, so dass die kleinen Br&ouml;ckchen sich in den Zwischenr&auml;umen der Wurzeln absetzen k&ouml;nnen. Die Phalaenopsis ist dann ausreichend verankert, wenn Sie sie am Wurzelhals samt Topf hochheben k&ouml;nnen, ohne dass sie sich aus dem Gef&auml;&szlig; l&ouml;st.</p>',
                'G&auml;rtnerei Sommer',
                'Resources/img/phalaenopsis.jpg', 9
)