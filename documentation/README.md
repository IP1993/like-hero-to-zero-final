## **Like Hero To Zero – CO₂‑Emissions‑Webanwendung**

## **Überblick**  
*Like Hero To Zero* ist eine datenbankgestützte Webanwendung, die im Rahmen des IU‑Moduls **IPWA02‑01 – Programmierung von industriellen Informationssystemen mit Java EE** entwickelt wurde.  
Sie ermöglicht die transparente Darstellung von CO₂‑Emissionsdaten und bietet Wissenschaftlern eine geschützte Möglichkeit, neue Datensätze einzupflegen.

Die Anwendung basiert vollständig auf **Jakarta EE** (JSF, CDI, JPA) und läuft auf einem **Apache TomEE** Server. Die Daten werden in einer relationalen Datenbank (z. B. MySQL) gespeichert.

Es existieren zwei klar definierte Benutzerrollen:

- **Citizen (Bürger)** – kann CO₂‑Daten öffentlich einsehen  
- **Scientist (Wissenschaftler)** – kann neue Emissionsdaten hinzufügen (geschützter Bereich)

---

## **Funktionen**

### **Benutzerrollen**
- **Scientist**  
  - Login erforderlich  
  - Kann neue Emissionsdatensätze anlegen  
  - Zugriff auf geschützte Seite `scientist.xhtml`
- **Citizen**  
  - Öffentlicher Zugriff  
  - Nur Lesezugriff auf Emissionsdaten  

### **Seiten**
- `index.xhtml` – Startseite mit Navigation  
- `login.xhtml` – Login‑Formular  
- `citizen.xhtml` – Öffentliche CO₂‑Ansicht (read‑only)  
- `scientist.xhtml` – Geschütztes Dashboard für Wissenschaftler  

### **Datenbank‑Entitäten**
- `User` – Login‑Informationen und Rollen  
- `Country` – Länder  
- `Emission` – CO₂‑Werte pro Land und Jahr  

### **Verwendete Technologien**
- Jakarta EE (JSF, CDI, JPA)  
- Apache TomEE  
- MySQL oder kompatible Datenbank  
- Maven  
- Java 17+  

---

## **Systemarchitektur**

Die Anwendung folgt dem klassischen Jakarta‑EE‑Schichtenmodell:

- **Frontend:** JSF‑Seiten (XHTML)  
- **Backend:** CDI‑Beans für Login, Rollenprüfung und Datenverwaltung  
- **Persistenz:** JPA‑Entitäten und MySQL‑Datenbank  
- **Server:** Apache TomEE  
- **Deployment:** WAR‑Archiv  

---

## **Projektstruktur**

*(Screenshots aus dem Repository)*

<img width="220" height="239" alt="Projektstruktur" src="https://github.com/user-attachments/assets/91146a1d-9bdc-46fa-a10c-4daa6e948f2c" />

<img width="194" height="218" alt="Projektstruktur" src="https://github.com/user-attachments/assets/5c265212-55a2-45ed-bad6-fd8ad2a25349" />

---

## **Installation & Ausführung**

### **1. Repository klonen**
```bash
git clone https://github.com/IP1993/like-hero-to-zero-final.git
```

### **2. Datenbank konfigurieren**
Eine neue MySQL‑Datenbank anlegen und die Zugangsdaten in:

```
src/main/resources/META-INF/persistence.xml
```

anpassen.

### **3. Deployment auf TomEE**
- Projekt mit Maven bauen  
- WAR‑Datei deployen oder direkt aus IntelliJ starten  

### **4. Beispiel‑Benutzer**
Die Benutzer müssen manuell in der Datenbank angelegt werden:

| Benutzername | Passwort | Rolle      |
|--------------|----------|------------|
| scientist    | scientist| scientist  |
| citizen      | citizen  | citizen    |

---

## **UML‑Diagramm**

Das UML‑Strukturdiagramm befindet sich im Dokumentations‑PDF und zeigt:

- alle Entitäten (User, Country, Emission)  
- alle Beans (LoginBean, AuthBean, CitizenBean, ScientistBean, JPAInitBean)  
- Beziehungen (1:n, 1:1, read‑only, create)  
- Rollenlogik und Datenfluss  

---

## **Dokumentation**

Die vollständige Projektdokumentation befindet sich im Repository als:

```
dokument.pdf
```

Sie enthält:

- Einleitung & Zielsetzung  
- Systemarchitektur  
- Beschreibung der Seiten  
- Screenshots  
- Datenbankstruktur  
- UML‑Strukturdiagramm  
- Methodik  
- Fazit  
- Literaturverzeichnis (APA 7)  

---

## **Hinweise**

- Das Projekt wurde im Rahmen des IU‑Moduls **IPWA02‑01** entwickelt.  
- Ziel ist die Demonstration von JSF, CDI, JPA und rollenbasiertem Zugriff.  
- Die Anwendung ist bewusst einfach gehalten, um die Kernkonzepte klar darzustellen.  
- Sie bildet eine solide Grundlage für mögliche Erweiterungen (Filter, Diagramme, API‑Anbindung).

---

## **Autor**

**Iliyan Milenov Petrov (IP1993)**  
IU Internationale Hochschule

---
