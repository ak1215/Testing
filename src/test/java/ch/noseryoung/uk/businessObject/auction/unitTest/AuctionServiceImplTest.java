package ch.noseryoung.uk.businessObject.auction.unitTest;
import ch.noseryoung.uk.businessObject.auction.Auction;
import ch.noseryoung.uk.businessObject.auction.AuctionRepository;
import ch.noseryoung.uk.businessObject.auction.AuctionService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.mockito.BDDMockito.given;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class AuctionServiceImplTest {
    private List<Auction> listOfAuctionsToBeTestedAgainst = new ArrayList<>();
    @Autowired
    private AuctionService auctionService;
    @MockBean
    private AuctionRepository auctionRepository;

    @BeforeEach
    void setUp() {
        listOfAuctionsToBeTestedAgainst = (Arrays.asList(
                new Auction(1, 320),
                new Auction(2, 340),
                new Auction(3, 350)
        ));
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    public void getAuctionByRange_requestAllAuctions_returnAllAuctions() throws Exception {
        given(auctionRepository.findAll()).willReturn(listOfAuctionsToBeTestedAgainst);
        List<Auction> rangeOfPrice = auctionService.getAuctionByRange(700, 300);
        Assertions.assertThat(listOfAuctionsToBeTestedAgainst.get(0).getPrice()).isEqualTo(rangeOfPrice.get(0).getPrice());
    }
}