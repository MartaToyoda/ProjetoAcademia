# Seca Gordura Academia

Este é o repositório do projeto "Seca Gordura Academia", um aplicativo web desenvolvido com o framework Spring Boot e Thymeleaf para ajudar as pessoas a acompanhar seu progresso de emagrecimento e calcular o Índice de Massa Corporal (IMC).

## Descrição do Projeto

Nossa aplicação oferece três rotas principais, cada uma com sua funcionalidade específica relacionada ao tema "Academia". Abaixo, descrevemos brevemente cada rota e sua funcionalidade:

1. **Rota 1 - Boas-vindas**
   - A rota `http://localhost:4500/rota1/{nome}` exibi uma tela de boas-vindas personalizada com o nome fornecido na URL.

2. **Rota 2 - Descrição de Peso e Altura**
   - A rota `http://localhost:4500/rota2/{peso}/{altura}` exibi uma tela descrevendo o peso e altura fornecidos na URL.

3. **Rota 3 - Cálculo de IMC**
   - A rota `http://localhost:4500/rota3/{altura}/{peso}` calcula o Índice de Massa Corporal (IMC) com base na altura e peso inseridos na URL. Além disso, ela fornece uma interpretação do resultado do IMC, indicando se você está abaixo do peso, com peso normal ou acima do peso.

**Observação:** Lembre-se de que a altura e o peso devem ser inseridos no formato decimal.

## Como Usar

Para executar o projeto em sua máquina, siga estas etapas:

1. Clone este repositório.
2. Importe o projeto em sua IDE preferida, como Eclipse ou IntelliJ.
3. Certifique-se de que você possui o Spring Boot e todas as dependências configuradas.
4. Execute a classe HomeController para iniciar o servidor.
5. Abra seu navegador e acesse http://localhost:4500 para acessar o aplicativo da academia Seca Gordura.

## Estilo e Personalização

O projeto inclui um arquivo CSS (estilo.css) para personalizar o estilo da página HTML. Sinta-se à vontade para fazer modificações e personalizar o design conforme desejado.

## Contribuições

Contribuições são bem-vindas! Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request. Aproveite o uso do projeto da academia Seca Gordura e boa sorte em sua jornada de emagrecimento!

---

### Equipe Seca Gordura Academia
Marta Toyoda e Rian Mendonça
