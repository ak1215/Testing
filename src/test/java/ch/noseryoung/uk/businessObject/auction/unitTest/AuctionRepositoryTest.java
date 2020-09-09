package ch.noseryoung.uk.businessObject.auction.unitTest;

import ch.noseryoung.uk.businessObject.auction.Auction;
import ch.noseryoung.uk.businessObject.auction.AuctionRepository;
import ch.noseryoung.uk.businessObject.auction.dto.AuctionDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class AuctionRepositoryTest {
    private Auction auctionToBeTestedAgainst = new Auction();
    private List<Auction> listOfAuctionsToBeTestedAgainst = new ArrayList<>();


    @Autowired
    private AuctionRepository auctionRepository;
    @MockBean
    private AuctionDTO auctionDTO;

    @BeforeEach
    void setUp() {
        listOfAuctionsToBeTestedAgainst = (Arrays.asList(
                new Auction(1, 100),
                new Auction(2, 90),
                new Auction(3, 120)
        ));
    }

    @AfterEach
    void tearDown() {
    }

    }
