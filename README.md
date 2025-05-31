# 🧾 HR Employee Manager - REST API Backend

## 📌 Descrizione

Questo progetto è una **REST API sviluppata in Spring Boot (Java 17)** che gestisce i dati dei dipendenti all'interno di uno schema Oracle HR, **modificato per supportare nuove funzionalità avanzate**.

È pensato per essere utilizzato come backend a supporto di progetti frontend sviluppati in **Angular** o **React Native**.

---

## 🧠 Schema del Database

La base dati è il classico schema `HR` di **Oracle**, ma con le seguenti **modifiche strutturali**:

- Aggiunta di un campo `expire_date` alla tabella `EMPLOYEES`:
  - Se `expire_date` è `null`, l'employee è considerato attivo.
  - Se ha un valore, l'employee è stato "cancellato logicamente" e viene escluso dalle ricerche.

- Aggiunta di una **relazione diretta tra `JOBS` e `DEPARTMENTS`**:
  - La tabella `JOBS` ora contiene una **foreign key `department_id`**.
  - Questo permette, lato frontend, di filtrare facilmente i job disponibili in base al dipartimento selezionato.

---

## 🛠️ Funzionalità dell’API

- 🔍 **Ricerca avanzata** degli employee per:
  - Nome
  - Dipartimento
  - Location
  - Country
  - Regione

- ✍️ **CRUD completo** (Create, Read, Update, Delete):
  - La cancellazione è **logica**, basata su `expire_date`.

- 🔗 **Relazioni aggiornate** per semplificare il binding tra modelli nel frontend (es. selezione di job filtrati per department).

---

## 🧰 Stack Tecnologico

| Tecnologia / Libreria | Scopo |
|-----------------------|-------|
| ☕ **Java 17** | Linguaggio principale |
| 🚀 **Spring Boot** | Framework di sviluppo |
| 🌐 **Spring Web / REST Controller** | Esposizione delle API |
| 🧩 **Spring Data JPA (Hibernate)** | ORM per la gestione dei dati |
| 🛢️ **Oracle DB** | Database relazionale |
| 📡 **JDBC Oracle Driver** | Connettore al DB |
| 🧱 **MapStruct** | Mapping automatico tra DTO e Entity |
| 🔐 **CORS Custom Filter** | Gestione delle policy CORS per frontend |
| 🧪 **Postman / Swagger (consigliati)** | Test degli endpoint REST |

---

## 🎯 Obiettivo

Questo progetto è stato pensato per:

- ✅ Avere un BE per **chiamate REST reali** per frontend sviluppati in Angular o React Native.
- ✅ Simulare un ambiente enterprise con dati realistici e architettura modulare.
- ✅ Implementare logica di **cancellazione soft**, mappatura DTO/Entity pulita e ricerca avanzata su un modello HR complesso.

