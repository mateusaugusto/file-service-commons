package DTO;

import lombok.Data;

@Data
public class FileDTO {

    private String name;
    private java.nio.file.Path path;
}
