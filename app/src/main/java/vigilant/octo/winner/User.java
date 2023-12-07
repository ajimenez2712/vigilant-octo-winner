package vigilant.octo.winner;

import com.google.gson.annotations.SerializedName;

class User {
    enum Gender {
        @SerializedName("female")
        FEMALE("female"),
        @SerializedName("male")
        MALE("male");

        public final String text;

        private Gender(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    enum Status {
        @SerializedName("inactive")
        INACTIVE("inactive"),
        @SerializedName("active")
        ACTIVE("active");

        public final String text;

        private Status(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    private int id;
    private String name;
    private String email;
    private Gender gender;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("<< User >>\n"
                + "id: %s\n"
                + "name: %s\n"
                + "email: %s\n"
                + "gender: %s\n"
                + "status: %s\n", id, name, email, gender.getText(), status.getText());
    }
}
