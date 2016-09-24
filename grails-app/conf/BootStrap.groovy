import com.test.myapp.Contact

class BootStrap {

    def init = { servletContext ->
        if(Contact.list().size() == 0){
            loadContacts()
        }

    }
    def destroy = {
    }
    def load = { Object dm ->
        dm.save(flush: true, failOnError: true)
        dm
    }
    def loadContacts = {
           32.times{
           Contact c = load(new Contact(name:"Contact"+(it+1),phoneNumber:"99123456"+(it+1),location:"location"+(it+1),createdOn:new Date(),updatedOn:new Date()))
           c.save(flush: true, failOnError: true);
       }
        }
    }