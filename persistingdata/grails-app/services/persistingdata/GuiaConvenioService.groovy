package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.updateData

@Transactional
class GuiaConvenioService {
    def saveDataBase() {
        updateData(GuiaConvenio, "/convenio")
    }
}
