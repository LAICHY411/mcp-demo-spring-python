#  MODEL CONTEXT PROTOCOL
Ce projet développe un agent AI intelligent basé sur le Model Context Protocol (MCP), un standard ouvert pour intégrer des LLMs (comme GPT-4 ou Mistral) avec des outils et données externes. L'agent suit l'architecture ReaAct (Reasoning/Action) : il raisonne via des prompts structurés (few-shot learning, system messages), exécute des actions via des outils connectés (bases de données, APIs), et s'adapte grâce à des observations dynamiques. Implémenté en Java/Python avec MCP, il supporte deux modes de transport (stdio pour les subprocess, HTTP-SSE pour le streaming) et des cas d'usage concrets comme l'assistance académique ou la planification personnelle. Le tout est orchestré via des appels JSON-RPC 2.0 standardisés, permettant une intégration transparente dans des workflows complexes.

### Architecture de base du projet
![image](https://github.com/user-attachments/assets/4b521ee5-4847-4300-a9df-343e38ea8dd5)

### Creation du classe StockTools

![image](https://github.com/user-attachments/assets/299479fb-8f43-4125-acf1-ec4d2e5be1c3)

### Creation d'un Bean MethodToolCallBackProvider

![image](https://github.com/user-attachments/assets/b1f94266-4915-463f-90d1-d9b7a36ecb83)

### Configuration initiale du mcp-server

![image](https://github.com/user-attachments/assets/9040bd60-0064-40b4-bcb6-9c062db9aaf9)

### Exemple de lancement (Exploration du nombre de tools existant)

![image](https://github.com/user-attachments/assets/675cef76-16d7-43e0-a69c-a4bb03798084)

### Lancement du protocole MCP avec POSTMAN

![image](https://github.com/user-attachments/assets/7b89b8a6-a95e-4b24-a707-164f8e0a634b)

### Exploration du cycle du vie du protocol MCP

### 1 - Connection au serveur a l'aide d'une methode GET

![image](https://github.com/user-attachments/assets/8c307b47-8e84-4c02-98a3-092eff43cb02)

### 2 - Initialisation avec l'id du session utilisant POST

![image](https://github.com/user-attachments/assets/ecacb08c-7a89-41a5-b64e-f157da328f39)

### 3 - Initialisation notification

![image](https://github.com/user-attachments/assets/e1cb293a-3ca3-4234-889f-0f96c47e669a)

### 4 - Afficher la liste des Tools

![image](https://github.com/user-attachments/assets/6c04e399-ff86-48aa-9dc5-4c9c2c0cef52)

### Resultat du requette 

![image](https://github.com/user-attachments/assets/3794b5f1-cbbf-4ff6-9643-c8957dfa17b5)

### 5- appel a Tool particulier 

### Exemple getAllCompanies 

![image](https://github.com/user-attachments/assets/5abfaeaf-6c92-4f3a-9f4e-33327d9b1db8)

### resultat du requete 

![image](https://github.com/user-attachments/assets/8afc48ba-393b-435a-a638-18a9179b73d7)

# Manipulation du mcp-client

### creation d'un AI Agent

![image](https://github.com/user-attachments/assets/f83f4c6e-4090-428a-adb8-5951cb39d813)

### Creation d'un rest controller 

![image](https://github.com/user-attachments/assets/fad6ee4e-7221-435d-8fef-17a71fe7c190)
