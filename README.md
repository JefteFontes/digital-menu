# Digital Menu

## Índice

1. [Descrição do Projeto](#descrição-do-projeto)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Instalação](#instalação)
4. [Funcionalidades](#funcionalidades)
5. [Estrutura do Código](#estrutura-do-código)
6. [Como Usar](#como-usar)
7. [Contribuição](#contribuição)

## Descrição do Projeto

O **Digital Menu** é um aplicativo Android que permite aos usuários visualizar um menu digital de um restaurante, selecionar pratos e finalizar pedidos. O aplicativo é projetado para melhorar a experiência do cliente, tornando o processo de pedido mais rápido e eficiente. Os usuários podem escolher entre diversas categorias de pratos, como entradas, pratos principais, bebidas e sobremesas, e visualizar informações detalhadas, como preços e tempos de preparo.

## Tecnologias Utilizadas

- **Linguagem de Programação:** Kotlin
- **Plataforma:** Android
- **Ambiente de Desenvolvimento:** Android Studio
- **Bibliotecas Utilizadas:** 
  - Android Jetpack
  - View Binding

## Instalação

Para instalar o projeto, siga os seguintes passos:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seuusuario/digital-menu.git
   ```
   
2. **Abra o projeto no Android Studio.**
3. **Sincronize o projeto com o Gradle.**
4. **Conecte um dispositivo Android ou inicie um emulador.**
5. **Execute o aplicativo.**

## Funcionalidades

- Visualização do menu com diferentes categorias de pratos.
- Seleção de pratos através de checkboxes.
- Cálculo automático do total do pedido com base nos itens selecionados.
- Feedback ao usuário através de mensagens (Toast) para ações como finalização do pedido.
- Interface amigável e intuitiva.

## Estrutura do Código

A estrutura do projeto é a seguinte:

```
digital-menu
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── jeftinfonti
│   │   │   │           └── digitalmenu
│   │   │   │               ├── MainActivity.kt
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values
│   │   │   │   │   └── strings.xml
│   │   ├── build.gradle.kts
│   ├── gradle
│   │   └── wrapper
│   ├── settings.gradle.kts
└── README.md
```

- **MainActivity.kt:** Contém a lógica principal do aplicativo, incluindo o gerenciamento de eventos de clique e atualização do total do pedido.
- **activity_main.xml:** Layout principal da interface do usuário.

## Como Usar

1. Abra o aplicativo em um dispositivo Android.
2. Navegue pelo menu digital e selecione os itens desejados utilizando os checkboxes.
3. Verifique o total do pedido exibido na parte inferior da tela.
4. Clique no botão "Finalizar Pedido" para enviar o pedido. Uma mensagem de confirmação será exibida.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um *pull request* ou relatar problemas.

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/SeuRecurso`).
3. Faça suas alterações e adicione os arquivos modificados (`git add .`).
4. Realize o commit das suas alterações (`git commit -m 'Adicionando um novo recurso'`).
5. Faça o push da sua branch (`git push origin feature/SeuRecurso`).
6. Abra um pull request.
