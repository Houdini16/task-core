# Task Core

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen)
![Maven](https://img.shields.io/badge/Maven-blue)

Module métier pour la gestion des tâches, développé dans le cadre du projet DevOps L3 ISI.

## 📋 Description

`task-core` est le module métier de la plateforme de gestion de tâches. Il fournit :
- Les entités JPA pour la persistance
- La logique métier pour la gestion des tâches
- L'accès aux données via Spring Data JPA

Ce module est conçu pour être utilisé par `task-api`, le module REST qui expose les endpoints.

## 🔧 Prérequis

- **Java 17**
- **Maven 3.x**
- **MySQL 8.x**
- **Nexus Repository** (pour le déploiement)

## 📁 Structure du projet

```
task-core/
├── src/main/java/sn/isi/l3gl/core/task/
│   ├── Task.java            # Entité JPA
│   ├── TaskStatus.java      # Enum (TODO, IN_PROGRESS, DONE)
│   ├── TaskRepository.java  # Repository JPA
│   └── TaskService.java     # Logique métier
├── src/main/resources/
│   └── application.properties
└── pom.xml
```

## ✨ Fonctionnalités

| Méthode | Description | Version |
|---------|-------------|---------|
| `createTask(Task task)` | Créer une nouvelle tâche | 0.0.1-SNAPSHOT |
| `listTasks()` | Lister toutes les tâches | 0.1.0-SNAPSHOT |
| `updateStatus(Long id, TaskStatus status)` | Modifier le statut d'une tâche | 0.2.0-SNAPSHOT |
| `countCompletedTasks()` | Compter les tâches terminées (DONE) | 0.3.0-SNAPSHOT |

## 🚀 Installation

### 1. Configuration de la base de données

Créer la base MySQL :
```sql
CREATE DATABASE task_manager;
```

Configurer `src/main/resources/application.properties` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=root
spring.datasource.password=votre_mot_de_passe
```

### 2. Build

```bash
mvn clean install
```

### 3. Déploiement sur Nexus

```bash
mvn clean deploy
```

## 📦 Historique des versions

| Version | Type | Fonctionnalité |
|---------|------|----------------|
| 0.0.1-SNAPSHOT | Snapshot | `createTask()` |
| 0.1.0-SNAPSHOT | Snapshot | `listTasks()` |
| 0.2.0-SNAPSHOT | Snapshot | `updateStatus()` |
| 0.3.0-SNAPSHOT | Snapshot | `countCompletedTasks()` |
| 0.3.0 | Release | Version finale |

## ⚙️ Configuration Nexus

### settings.xml

Fichier `~/.m2/settings.xml` :

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 
                              https://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
    <server>
      <id>nexus-snapshots</id>
      <username>admin</username>
      <password>VOTRE_MOT_DE_PASSE</password>
    </server>
    <server>
      <id>nexus-releases</id>
      <username>admin</username>
      <password>VOTRE_MOT_DE_PASSE</password>
    </server>
  </servers>
</settings>
```

### URLs Nexus

- **Snapshots**: `http://localhost:8081/repository/maven-snapshots/`
- **Releases**: `http://localhost:8081/repository/maven-releases/`

## 🔗 Liens

- **GroupId**: `sn.isi.l3gl.core`
- **ArtifactId**: `task-core`
- **Dépendance dans task-api**: `task-core:0.3.0`

## 👥 Auteurs

- **Abdoulaye Bilal S. Diop** - [GitHub](https://github.com/Houdini16)
- **Madieye Anne** - [GitHub](https://github.com/Madieyeee)

**Date**: Février 2026
