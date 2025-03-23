import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.json.*;


enum Status {
    TODO,
    IN_PROGRESS,
    DONE;
}

public class Task {
    private final ZoneId z = ZoneId.of("America/Chicago");
    private int id;
    private String description;
    private Status status;
    private String createdAt;
    private String updatedAt;

    public Task(int id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = Status.TODO;
        this.updatedAt = this.createdAt = ZonedDateTime.now(z).toString();
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getCreationTime() {
        return this.createdAt;
    }

    public String getUpdateTime() {
        return this.updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setUpdateTime() {
        this.updatedAt = ZonedDateTime.now(z).toString();
    }

    @Override public String toString() {
        String taskString = "ID: " + this.id 
                            + "\nDescription: " + this.description 
                            + "\nStatus: " + this.status
                            + "\nCreated At: " + this.createdAt
                            + "\nUpdated At: " + this.updatedAt;
        return taskString;
    }
}

