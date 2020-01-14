# Adapter Design Pattern



## Problemstellung

Von einem Adapter hat jeder schonmal gehört. Das Fehlen eines VGA-zu-HDMI-Adapter hat schon so manchen Unterricht für einige Minuten lahmgelegt – so ein Pech. Oder man benötigt für den lang ersehnten Englandurlaub einen Steckdosenadapter, um das Handy aufzuladen. Adapter gibt es aber auch in der Welt der Softwareentwicklung. 



## Definition

![](/img/Adapter.svg)

Bei einem Adapter liegt immer das Problem vor, dass ein Programm auf Funktionen eines anderen Programms (Dienst) zugreifen möchte. Dies ist so aber nicht möglich, da die Programme in ihrer Architektur so auseinandergehen, dass sie nicht einfach aufeinander zugreifen können. Im obigen Beispiel möchte das Interface *Programm* und alle Klassen, die es implementieren auf die Methode service() der Klasse Dienst zugreifen, bzw. diese verwenden. Dies ist allerdings nicht ohne Weiteres möglich. Dafür kann es diverse Gründe geben:

- Das Datenformat, welches von *Programm* übergeben wird, ist nicht dasselbe wie das von Dienst. 
- operation() und service() haben nicht die gleiche Signatur[1]
- Der Dienst stammt von Drittanbietern und sein Code kann nicht direkt an die eigene Architektur angepasst werden.
- Man verwendet einen Dienst, der als Wiederverwendbare Klasse entwickelt wurde und nicht verändert werden soll.



## Beispiel für einen Adapter

Man möchte ein Programm schreiben, welches die Temperatur eines Raumes in der Form ‘‘am dd-mm-jjjj hatte es um hh-mm-ss \<Temperatur>°C‘‘ ausgibt. Dies soll alle 10 Sekunden ausgegeben werden. Die Daten, welche ausgegeben werden sollen, können von einem Sensor in der Form ‘‘\<Temperatur in Fahrenheit>‘‘ abgefragt werden.

Um diesen Sensor zu simulieren, schreiben wir eine Klasse welche zufällige Werte liefert. Nun schreiben wir einen Adapter, um die Sensordaten abzufragen und diese in Celsius umzuwandeln[2]. Zum Schluss wird nun eine Anzeigeklasse geschrieben. Diese hat einen Adapter als Parameter und gibt über die Methode `displayData()` die umgewandelten Werte in der Konsole aus. 

Wie wir sehen, entspricht unsere konkrete Umsetzung dem zugrundeliegenden Design-Pattern.

![](/img/ImplementedAdapter.svg)

------

[[1\]](#_ftnref1) https://de.wikipedia.org/wiki/Signatur_(Programmierung)

[2] https://celsius-fahrenheit.net/