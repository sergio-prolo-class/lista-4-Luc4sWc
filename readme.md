# 🎨 Editor Interativo de Figuras Geométricas

Projeto de Programação Orientada a Objetos em Java que implementa um editor visual de formas geométricas usando a biblioteca gráfica `algs4.Draw`.

---

## 🧰 Funcionalidades

- Desenhar **Quadrados, Círculos, Pentágonos e Hexágonos** com o mouse
- Alternar entre **formas, cores e preenchimento**
- Redimensionar figuras
- **Mover todas as figuras** com as setas do teclado
- Limpar a tela (`C`)
- Imprimir estatísticas (`P`) como:
  - Total de figuras
  - Soma dos perímetros
  - Área média
---

## 🕹️ Controles

| Tecla       | Ação                                  |
|-------------|----------------------------------------|
| **Clique**  | Desenha a figura atual na posição      |
| **F**       | Alterna entre preenchido ↔ contorno    |
| **F1**      | Muda para Quadrado                     |
| **F2**      | Muda para Círculo                      |
| **F3**      | Muda para Pentágono                    |
| **F4**      | Muda para Hexágono                     |
| **F5**      | Cor: Preto                             |
| **F6**      | Cor: Azul                              |
| **F7**      | Cor: Vermelho                          |
| **F8**      | Cor: Amarelo                           |
| **Q**       | Diminui o tamanho da figura            |
| **W**       | Aumenta o tamanho da figura            |
| **← ↑ → ↓** | Move todas as figuras desenhadas       |
| **C**       | Limpa a tela                           |
| **P**       | Mostra estatísticas no terminal        |

---

## 💻 Como Executar

### Requisitos

- Java 17+
- Biblioteca `algs4.jar` no classpath

### Compilação

```bash
javac -cp .:algs4.jar ifsc/poo/*.java ifsc/poo/Formas/*.java
```
---

### Execução

```bash
java -cp .:algs4.jar ifsc.poo.App
```
---

# Preview

![Image](https://github.com/user-attachments/assets/4515c7ff-6116-4128-a66d-be5052449811)
