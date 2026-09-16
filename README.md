# **Programação Orientada a Objetos - SI/IFAL**

Respostas das listas de exercícios da disciplina de Programação Orientada a Objetos do curso de SI do IFAL - campus Arapiraca.
Para facilitar o acesso aos códigos as resoluções das listas, teremos um novo `commit` para cada resolução de lista. Assim, vocês podem navegar entre eles e acompanhar as alterações realizadas.
</br>

## **Como fazer o download do projeto**

1. Abra o terminal
2. Acesse a pasta onde deseja baixar o projeto.
3. Utilize o comando (baixar) o projeto: `git clone https://github.com/tarsisms/ListasPOO.git`
   </br>

## **Baixando a versão mais atual do projeto**

1. Abra o terminal e acesse a pasta do projeto ou abra o terminal da propria IDE (VSCode ou Android Studio)
2. Execute o comando e digite: `git pull origin main`
   </br>

## **Estrutura do projeto**

O projeto é organizado em pacotes por lista de exercícios, e cada lista é dividida em pacotes por questão:

```
src/main/java/listaNN/questaoNN/
src/test/java/listaNN/questaoNN/
```

Exemplos:

- `lista10.questao01` — Hierarquia de seguros (`Seguro`, `SeguroAutomotivo`, `SeguroResidencial`, `SeguroVida`)
- `lista10.questao02` — Hierarquia de planos de academia (`PlanoBasico`, `PlanoPremium`, `PlanoVIP`, `PlanoAcademia`)
- `lista10.questao03` — Hierarquia de cursos (`Curso`, `CursoEAD`, `CursoHibrido`, `CursoPresencial`)

Cada questão possui uma classe `Main` com um exemplo de uso e testes correspondentes em `src/test/java`.
</br>

