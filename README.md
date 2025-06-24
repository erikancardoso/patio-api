✅ Análise de Requisitos – Projeto "Pátio API"
📌 1. Objetivo do Projeto
Desenvolver uma API RESTful para gerenciar pátios logísticos, com foco na organização, registro e controle das operações realizadas nesses locais.

🧭 2. Público-alvo
Equipe interna da Mottu

Sistemas e integrações que consumirão a API (ex: dashboard, aplicativos, ferramentas administrativas)

🧱 3. Funcionalidades Principais (MVP)
📂 Gestão de Pátios
Criar, listar, atualizar e remover pátios

Atribuir localizações e capacidade operacional

🚚 Controle de Veículos
Entrada e saída de veículos nos pátios

Registro de horários e tipo de operação

👤 Usuários e Acessos (futuro)
Controle de perfis: administrador, operador, supervisor

Autenticação e autorização via token (ex: JWT)

📦 Inventário e Recursos (futuro)
Controle de ativos no pátio: containers, motos, etc.

Relatórios e dashboards de movimentações

🧑‍💻 4. Requisitos Técnicos
Requisito	Descrição
Backend	Spring Boot 3.4.5
Documentação da API	Swagger Core 2 (manual)
Formato da documentação	JSON acessível via /openapi.json
Interface visual da documentação	Swagger UI em /swagger-ui/index.html (estático via /static)
Empacotamento	Maven
Testes	JUnit (habilitado via Surefire Plugin)

🗂️ 5. Estrutura do Projeto
com.mottu.patio.controller – Controllers REST da API

com.mottu.patio.config – Configurações do Swagger e outros beans

src/main/resources/static/swagger-ui/ – Arquivos estáticos da interface Swagger UI

openapi.json – Gerado a partir dos controllers e configurações

🧩 6. Integrações
Integração	Status
Swagger UI	✅ Funcional
Spring REST	✅ Endpoints expostos e testáveis
OpenAPI JSON	✅ Servido via /openapi.json

📝 7. Requisitos não-funcionais
Item	Descrição
Escalabilidade	Código preparado para expandir com autenticação, permissões, métricas
Manutenibilidade	Separação de pacotes e uso de boas práticas
Documentação	Integrada à API, via Swagger UI

🔜 Próximos Passos (Sugeridos)
 Criar entidades (modelos) como Patio, Veiculo, Movimentacao

 Implementar autenticação via JWT (Spring Security)

 Criar testes de integração para os endpoints principais

 Integrar com banco de dados (H2 para dev, PostgreSQL para produção)

 Adicionar filtros e paginação nas listagens

 Gerar versão OpenAPI em YAML (opcional)
