package dumbProggers.DigitalKachevnik.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;//имя изображения на странице

    @Column(name = "originalFileName")
    private String originalFileName;

    @Column(name = "size")
    private Long size;

    @Column(name = "contentType")
    private String contentType;//тип

    @Lob//поле в БД хранится в типе LONGBLOB
    @Column(name = "bytes", columnDefinition = "longblob")
    private byte[] bytes;

    @OneToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)//отношение, что делать при изменении и тип загрузки(ленивый...)
    private User user;//внешний ключ
}
