/*
1. Crear un ficheiro de texto chamado "produtos.txt".

2. Escribir no ficheiro 5 nomes de produtos, un en cada liña.
   Exemplo:
   - Pan
   - Leite
   - Ovos
   ...

3. Ler o ficheiro usando BufferedReader liña por liña.

4. Mostrar por pantalla:
   - cada produto lido
   - o número total de produtos

5. Crear un ficheiro binario chamado "prezos.dat".

6. Gardar no ficheiro binario:
   - o nome do produto (writeUTF)
   - o prezo do produto (writeDouble)

7. Ler o ficheiro binario e mostrar por pantalla:
   - nome do produto
   - prezo

8. Controlar as posibles excepcións necesarias.

REQUISITOS:
- Usar FileWriter ou BufferedWriter para escribir texto.
- Usar FileReader ou BufferedReader para ler texto.
- Usar DataOutputStream para escribir no ficheiro binario.
- Usar DataInputStream para ler do ficheiro binario.
- Usar EOFException para detectar o final do ficheiro binario.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppFicheiros {
    public static void main(String[] args) {
        File f1 = new File("produtos.txt");

        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Non se puido crear, erro: " + e.getMessage());
        }

        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1))) {
            bw1.write("ovos");
            bw1.newLine();

            bw1.write("leite");
            bw1.newLine();

            bw1.write("fariña");
            bw1.newLine();

        } catch (IOException e1) {
            System.out.println("Non se puido escribir, erro: " + e1.getMessage());
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader(f1))) {
            int contadorLineas = 0;
            String linea = br1.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br1.readLine();
                contadorLineas++;
            }
            br1.close();
            System.out.println("Numero de liñas: " + contadorLineas);

        } catch (IOException e) {
            System.out.println("Non se puido escribir, ler: " + e.getMessage());

        }
    }
}
