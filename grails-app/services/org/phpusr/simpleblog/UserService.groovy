package org.phpusr.simpleblog

import grails.transaction.Transactional

@Transactional
class UserService {

    def springSecurityService

    /** Возвращает залогненного пользователя */
    def getUser() {
        if (springSecurityService.loggedIn) {
            User.get(springSecurityService.principal.id as Long)
        } else null
    }

}
