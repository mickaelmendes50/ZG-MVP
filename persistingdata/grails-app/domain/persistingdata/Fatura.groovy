package persistingdata

class Fatura {
    List<GuiaHospital> guias

    List<GuiaHospital> getGuias() {
        return guias
    }

    void setGuias(List<GuiaHospital> guias) {
        this.guias = guias.collect()
    }

    static constraints = {
    }

    @Override
    String toString() {
        String str = ""
        for (guia in this.guias) {
            str += guia.toString() + "\n"
        }
        return str
    }
}
