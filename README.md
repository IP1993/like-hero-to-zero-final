## Like Hero To Zero – CO₂-Emissions-Webanwendung  

## Überblick  
Dieses Projekt implementiert ein einfaches CO₂‑Emissionsverwaltungssystem auf Basis von **Jakarta EE**, **JSF**, **CDI** und **JPA**.  
Es unterstützt zwei Benutzerrollen:

- **Citizen (Bürger)** – kann CO₂‑Daten einsehen  
- **Scientist (Wissenschaftler)** – kann neue Emissionsdaten hinzufügen (geschützter Bereich)

Die Anwendung läuft auf **Apache TomEE** und verwendet eine relationale Datenbank (z. B. MySQL) zur Speicherung der Daten.

---

## Funktionen

**Benutzerrollen**
- **Scientist**: Login erforderlich, kann neue Emissionsdatensätze anlegen  
- **Citizen**: Öffentlicher Zugriff, nur Lesezugriff  

**Seiten**
- `index.xhtml` – Startseite  
- `login.xhtml` – Login‑Formular  
- `citizen.xhtml` – Öffentliche CO₂‑Ansicht  
- `scientist.xhtml` – Geschütztes Dashboard für Wissenschaftler  

**Datenbank‑Entitäten**
- `User`  
- `Country`  
- `Emission`  

**Verwendete Technologien**
- Jakarta EE (JSF, CDI, JPA)  
- Apache TomEE  
- MySQL oder kompatible Datenbank  
- Maven  
- Java 17+  

---

## Projektstruktur

src/main/java/com/likeherotozero
 ├── beans
 │     ├── AuthBean.java
 │     ├── CitizenBean.java
 │     ├── LoginBean.java
 │     └── ScientistBean.java
 ├── entities
 │     ├── Country.java
 │     ├── Emission.java
 │     └── User.java
 └── startup
       └── JPAInitBean.java

src/main/resources/META-INF
 └── persistence.xml

src/main/webapp
 ├── index.xhtml
 ├── login.xhtml
 ├── citizen.xhtml
 ├── scientist.xhtml
 └── WEB-INF
       ├── web.xml
       └── beans.xml
---

## Installation & Ausführung

### 1. **Repository klonen**

git clone https://github.com/IP1993/like-hero-to-zero-final.git

### 2. **Datenbank konfigurieren**
Eine neue Datenbank anlegen und die Zugangsdaten in:

src/main/resources/META-INF/persistence.xml

anpassen.

### 3. **Deployment auf TomEE**
- Projekt mit Maven bauen  
- WAR‑Datei deployen oder direkt aus IntelliJ starten  

### 4. **Beispiel‑Benutzer**
Die Benutzer müssen manuell in der Datenbank angelegt werden:

| Benutzername | Passwort | Rolle      |
|--------------|----------|------------|
| scientist    | admi     | admin      |

---

## Dokumentation  
Die vollständige Projektdokumentation befindet sich im Repository als:

```
dokument.pdf
```

---

## Hinweise  
- Dieses Projekt wurde im Rahmen des IU‑Moduls IPWA02-01 entwickelt.  
- Ziel ist die Demonstration von JSF, CDI, JPA und rollenbasiertem Zugriff.  
- Die Anwendung ist bewusst einfach gehalten, um die Kernkonzepte klar darzustellen.

---

## Autor  
**Iliyan Milenov Petrov (IP1993)**  
IU Internationale Hochschule

- oder eine **Version mit Badge‑Icons**  

erstellen.
