## Project UML Diagram

Estrutura em UML do projeto:

![UML Class Diagram]()

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
