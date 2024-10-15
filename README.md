
# Digital Menu App

## Visão Geral
O **Digital Menu** é um aplicativo Android desenvolvido para oferecer uma experiência digital de cardápio para restaurantes. O aplicativo permite que os usuários visualizem uma variedade de opções de entrada, prato principal, bebidas e sobremesas. Os usuários podem selecionar os itens desejados e visualizar o preço total em tempo real, tornando o processo de pedido mais eficiente e interativo. Além disso, ao finalizar o pedido, o aplicativo simula o envio do pedido para o balcão do restaurante, proporcionando uma experiência de usuário agradável.

## Funcionalidades
### 1. Exibição do Cardápio
O aplicativo apresenta uma lista organizada de pratos divididos em quatro categorias: 
- **Entradas:** Pratos leves para começar a refeição.
- **Pratos Principais:** Opções substanciais para o prato principal.
- **Bebidas:** Variedade de bebidas quentes e frias.
- **Sobremesas:** Delícias para encerrar a refeição.

### 2. Cálculo Dinâmico de Preço
O preço total do pedido é atualizado automaticamente à medida que os usuários selecionam ou desmarcam os itens. Isso permite que os usuários acompanhem o custo total de suas escolhas em tempo real, evitando surpresas na hora da conta.

### 3. Confirmação de Pedido
Quando o usuário finaliza o pedido, uma mensagem de confirmação é exibida, informando que o pedido foi enviado para o balcão do restaurante. Essa funcionalidade simula a experiência de fazer um pedido real, tornando o aplicativo mais interativo.

## Estrutura do Código

### Classes Principais
- **Dish:** Esta classe de dados representa um prato e contém as seguintes propriedades:
  - `name`: Nome do prato.
  - `price`: Preço do prato.
  - `time`: Tempo de preparo do prato (opcional).
  
  O construtor da classe Dish permite a criação de instâncias com ou sem o tempo de preparo.

- **MainActivity:** Esta é a classe principal da Activity que gerencia a interação do usuário com o aplicativo. Ela contém a lógica para inicializar a interface do usuário, gerenciar seleções de pratos e calcular o total do pedido.

### Métodos Principais
- **onCreate:** Método chamado na criação da Activity. Inicializa a interface do usuário, configura listeners para os botões e checkboxes e inicializa as listas de pratos.
- **onClick:** Método que trata os cliques no botão "Finalizar Pedido". Verifica se algum item foi selecionado antes de prosseguir com o envio do pedido.
- **onCheckedChanged:** Método que trata as mudanças de estado nos CheckBoxes, atualizando o total do pedido com base nos itens selecionados ou desmarcados.
- **getItemPrice:** Método que retorna o preço do item correspondente ao ID do CheckBox selecionado.
- **updateTotal:** Método que atualiza o total exibido na tela, formatando o valor para exibição correta em moeda.
- **finishOrder:** Método que simula o envio do pedido e exibe uma mensagem de confirmação ao usuário.

## Estrutura do Projeto
```
- app
  - src
    - main
      - java
        - com.jeftinfonti.digitalmenu
          - MainActivity.kt
      - res
        - layout
          - activity_main.xml
        - values
          - strings.xml
          - colors.xml
      - AndroidManifest.xml
- build.gradle.kts
- settings.gradle.kts
```

## Requisitos
- **Android Studio:** O aplicativo foi desenvolvido utilizando o Android Studio, e é necessário ter o ambiente configurado para executar o projeto.
- **SDK do Android:** Certifique-se de que a versão do SDK do Android está compatível com o projeto.

## Como Usar
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/SeuUsuario/DigitalMenu.git
   ```
2. **Abra o projeto no Android Studio:**
   - Navegue até o diretório clonado e abra o projeto no Android Studio.
3. **Execute o aplicativo:**
   - Conecte um dispositivo Android ou inicie um emulador.
   - Clique no botão "Run" no Android Studio para instalar e executar o aplicativo.
4. **Interaja com o aplicativo:**
   - Selecione os itens desejados e veja o total ser atualizado.
   - Clique em "Finalizar Pedido" para ver a confirmação do pedido.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests para melhorias ou correções.
