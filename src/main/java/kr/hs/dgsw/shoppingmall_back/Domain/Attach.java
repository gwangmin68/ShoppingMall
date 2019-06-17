package kr.hs.dgsw.shoppingmall_back.Domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Attach {
    private Long id;
    private Long refId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;

    @Builder
    public Attach(Long refId, String filename, String filepath) {
        this.refId = refId;
        this.filename = filename;
        this.filepath = filepath;
    }
}
