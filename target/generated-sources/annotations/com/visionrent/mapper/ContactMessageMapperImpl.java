package com.visionrent.mapper;

import com.visionrent.domain.ContactMessage;
import com.visionrent.dto.request.ContactMessageRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-28T15:04:45-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ContactMessageMapperImpl implements ContactMessageMapper {

    @Override
    public ContactMessage contactMessageRequestToContactMessage(ContactMessageRequest contactMessageRequest) {
        if ( contactMessageRequest == null ) {
            return null;
        }

        ContactMessage contactMessage = new ContactMessage();

        contactMessage.setBody( contactMessageRequest.getBody() );
        contactMessage.setEmail( contactMessageRequest.getEmail() );
        contactMessage.setName( contactMessageRequest.getName() );
        contactMessage.setSubject( contactMessageRequest.getSubject() );

        return contactMessage;
    }
}
