package impl;

import Classes.Passport;
import Classes.WhatsApp;

import java.util.List;

public interface WhatsAppService {

    String instAllPassport(List<Passport> users);
    String addContact(List<WhatsApp> users,WhatsApp myUser);
    String getMessage (List<WhatsApp> users, WhatsApp myUser);
    String createPassport(List<Passport> whatsApps);
}
