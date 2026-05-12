import Header from '../components/Header';
import SectionCard from '../components/SectionCard';

const profile = {
  slogan: 'Define Detail, Elevate Fashion',
  intro:
    '我们专注服装辅料行业，主营各类纽扣与链条，并与多家知名品牌建立深度合作。通过材料创新与工艺升级，帮助品牌在细节中构建差异化价值。',
  products: ['高级树脂纽扣', '金属工艺纽扣', '箱包与服饰链条', '品牌定制辅件'],
  brands: ['LuxeWear', 'UrbanMotion', 'NOVA Atelier', 'METRO LINE']
};

export default function App() {
  return (
    <main className="app-bg">
      <div className="container">
        <Header />
        <SectionCard title="品牌主张">
          <h3>{profile.slogan}</h3>
          <p>{profile.intro}</p>
        </SectionCard>

        <div className="grid">
          <SectionCard title="主营业务">
            <ul>
              {profile.products.map((item) => (
                <li key={item}>{item}</li>
              ))}
            </ul>
          </SectionCard>

          <SectionCard title="深度合作品牌">
            <ul>
              {profile.brands.map((item) => (
                <li key={item}>{item}</li>
              ))}
            </ul>
          </SectionCard>
        </div>
      </div>
    </main>
  );
}
