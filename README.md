# Pre-flight Check Java

Ziel dieses Repositories ist ein **technischer Check** Ihrer Infrastruktur, sodass ein Java-basiertes Training
möglichst reibungslos abläuft.

Gehen Sie die Schritte bitte der Reihe nach durch und geben Sie Feedback an Ihre betreuende Person, wenn ein Check 
nicht erfolgreich abgeschlossen werden konnte.

## Check 1 -- Git

Öffnen Sie eine Kommandozeile auf Ihrem Rechner und geben folgenden Befehl ein:

````shell
git --version
````

Eine mögliche Ausgabe ist:
````shell
C:\Users\MaxMustermann>git --version
git version 2.36.1.windows.1
````

**Bedingungen:**
- Die Shell gibt keinen offensichtlichen Fehler aus, wie z.B. "Der Befehl ist entweder falsch geschrieben ..."
- Die Version beginnt mit "2." also z.B. "2.36.1.windows.1"

## Check 2 -- Java

Geben Sie folgenden Befehl in der Kommandozeile ein:

````shell
java -version
````

Eine mögliche Ausgabe ist:
````shell
C:\Users\MaxMustermann>java -version
java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)
````

**Bedingungen:**
- Die Shell gibt keinen offensichtlichen Fehler aus, wie z.B. "Der Befehl ist entweder falsch geschrieben ..."
- Die Version beginnt mit "11." oder höher also z.B. "11.0.1" oder "17.0"
 
## Check 3 -- Clonen eines GitHub Repositories

Clone Sie dieses Repository auf Ihren Rechner (in einem Verzeichnis Ihrer Wahl):

````shell
git clone https://github.com/tauinger-de/preflight-check-java.git
````

Eine mögliche Ausgabe ist:
````shell
D:\Temp>git clone https://github.com/tauinger-de/preflight-check-java.git
Cloning into 'preflight-check-java'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.
````

**Bedingungen:**
- Die Shell gibt keinen offensichtlichen Fehler aus, wie z.B. "Der Befehl ist entweder falsch geschrieben ..."
- Ein neues Verzeichnis namens "preflight-check-java" wurde auf Ihrer Festplatte angelegt


## Check 4 -- Bauen einer Java Anwendung mit Maven

Wechseln Sie in das eben angelegte Verzeichnis.

````shell
cd preflight-check-java
````

Dort führen Sie folgenden Befehl aus:

````shell
.\mvnw verify
````

Die Ausgabe hier kann sehr lang sein. Der Schluss könnte wie folgt aussehen:

````shell
...
...
...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar (316 kB at 1.9 MB/s)
[INFO] No tests to run.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ preflight-check-java ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.059 s
[INFO] Finished at: 2022-11-11T10:09:55+01:00
[INFO] ------------------------------------------------------------------------
````

**Bedingungen:**
- Die Shell gibt keinen offensichtlichen Fehler aus, wie z.B. "Der Befehl ist entweder falsch geschrieben ..."
- Nach einer Menge an Ausgaben kommt sehr weit unten "BUILD SUCCESS"
