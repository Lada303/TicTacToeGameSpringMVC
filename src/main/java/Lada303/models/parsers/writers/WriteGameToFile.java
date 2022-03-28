package Lada303.models.parsers.writers;

/*
Общий интерфейс для записи файлов содержащих процесс игры
 */

import java.io.File;

@FunctionalInterface
public interface WriteGameToFile {
    void writeGameToFile(File parserFile, String mapSize, int winner);
}
