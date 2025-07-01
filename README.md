## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Project UML Diagram

The following diagram illustrates the class structure of the project:

![UML Class Diagram](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKhCoKnELT2rKe300G00A_P26LdGKnLGfLSCckXABqefcYOW6f5AUx9AKe2eA0K_n4yXq2pGF4Q39v8gG0NKeKhLD-M8X19gYg7fXGfLKn29oV21A_K0YKOuLqL8qOjoKe1oKVnBArR_gXbpxXVQjC0tGkCoRXdYyP3uLdGjLYsoum5QZ80)

### Como Funciona

O projeto simula um smartphone simples com aplicações básicas: um navegador de internet, um reprodutor de música e um telefone.

-   **`App.java`**: Este é o ponto de entrada principal da aplicação. Ele cria um objeto `SmartPhone` e lida com a interação do usuário através de um menu de linha de comando para operar os recursos do smartphone.
-   **`SmartPhone.java`**: Esta é a classe principal, representando o próprio smartphone.
    -   Ela estende `ShowSmartPhoneMenu` para herdar métodos para exibir vários menus ao usuário.
    -   Ela implementa as interfaces `InternetBrowser`, `MusicPlayer` e `Telephone`, fornecendo implementações concretas para suas respectivas funcionalidades (por exemplo, `showPage`, `play`, `call`).
    -   Ela gerencia o estado das diferentes aplicações (por exemplo, se o navegador está aberto, se a música está tocando, se uma chamada está ativa).
-   **Interfaces (`InternetBrowser.java`, `MusicPlayer.java`, `Telephone.java`)**: Estas definem os contratos para as funcionalidades dos aplicativos de navegador, reprodutor de música и telefone, respectivamente. Por exemplo, `InternetBrowser` declara métodos como `showPage`, `newPage` и `refreshPage`.
-   **`ShowSmartPhoneMenu.java`**: Esta é uma classe abstrata que fornece métodos para exibir diferentes menus no console (por exemplo, menu principal, menu do navegador, menu de chamada). A classe `SmartPhone` herda esses métodos de exibição.

A classe `App` conduz a interação, recebendo a entrada do usuário para chamar métodos na instância `SmartPhone`. A classe `SmartPhone` então usa seus métodos de interface implementados e métodos de exibição de menu herdados para realizar ações e mostrar informações apropriadas ao usuário.
