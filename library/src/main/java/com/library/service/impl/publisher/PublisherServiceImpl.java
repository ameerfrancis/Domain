package com.library.service.impl.publisher;//package com.library.service.impl.publisher;
//
//import com.library.domain.publisher.Publisher;
//import com.library.repository.PublisherRepository;
//import com.library.service.PublisherService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service("PublisherServiceImpl")
//public class PublisherServiceImpl implements PublisherService {
//
//    @Qualifier("PublisherRepositoryImpl")
//
//    private PublisherServiceImpl service = null;
//    private PublisherRepository repository;
//
//    /*private AuthorServiceImpl(){
//        this.repository = AuthorServiceImpl.getRepository();
//    }*/
//
//    public PublisherService getService(){
//        if (service == null) service = new PublisherServiceImpl();
//        return service;
//    }
//
//
//    @Override
//    public Publisher create(Publisher publisher) {
//        return this.repository.create(publisher);
//    }
//
//    @Override
//    public Publisher update(Publisher publisher) {
//        return this.repository.update(publisher);
//    }
//
//    @Override
//    public void delete(String s) {
//        this.repository.delete(s);
//    }
//
//    @Override
//    public Publisher read(String s) {
//        return this.repository.read(s);
//    }
//
//    @Override
//    public ArrayList<Publisher> getAllPublishers() {
//        ArrayList<Publisher> publishers = getAll();
//
//        return null;
//    }
//
//    @Override
//    public ArrayList<Publisher> getAll() {
//        return this.repository.getAll();
//    }
//
//}
